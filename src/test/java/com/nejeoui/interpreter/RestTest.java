package com.nejeoui.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nejeoui.interpreter.concurrency.MyExecutor;
import com.nejeoui.interpreter.concurrency.SimulateSessionTask;
import com.nejeoui.interpreter.dto.Constants;
import com.nejeoui.interpreter.dto.InterpreterQuery;
import com.nejeoui.interpreter.dto.InterpreterResult;
import com.nejeoui.interpreter.dto.InterpreterType;

public class RestTest extends InterpreterApplicationTests {

	@Test
	public void oneSessionTest() throws Exception {
		String uri = "/exec";
		// First Query x=30
		InterpreterQuery query = new InterpreterQuery("%python x=30");
		String inputJson = super.mapToJson(query);
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).session(session)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		// Second Query %python print x
		query = new InterpreterQuery("%python print x");
		inputJson = super.mapToJson(query);

		mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).session(session)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

		status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		InterpreterResult result = super.mapFromJson(content, InterpreterResult.class);
		assertTrue(result.getResult().contains("30"));

	}

	@Test
	public void cleanInterpreterTest() throws Exception {
		String uri = "/exec";
		String uriClean = "/clean";
		// First Query %python x=45\nprint x
		InterpreterQuery query = new InterpreterQuery("%python x=45\nprint x");
		String inputJson = super.mapToJson(query);

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).session(session)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		InterpreterResult result = super.mapFromJson(content, InterpreterResult.class);
		assertTrue(result.getResult().contains("45"));

		// clean the interpreter locals and execute %python print x
		query = new InterpreterQuery("%python print x");
		inputJson = super.mapToJson(query);
		mvcResult = mvc.perform(MockMvcRequestBuilders.post(uriClean).session(session)).andReturn();

		query = new InterpreterQuery("%python print x");
		inputJson = super.mapToJson(query);

		mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).session(session)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
		status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		content = mvcResult.getResponse().getContentAsString();
		result = super.mapFromJson(content, InterpreterResult.class);
		assertTrue(result.getResult().contains("--Error-- :Traceback (most recent call last)"));
	}

	@Test
	public void unknownInterpreterTest() throws Exception {
		String uri = "/exec";
		String uriClean = "/clean";
		// First Query %Java int x=45;
		InterpreterQuery query = new InterpreterQuery("%Java int x=45;");
		String inputJson = super.mapToJson(query);

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).session(session)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		InterpreterResult result = super.mapFromJson(content, InterpreterResult.class);
		assertTrue(result.getResult().contains("--UNKOWN INTERPRETER--"));
	}

	@Test
	public void multiSessionsTest() throws Exception {
		int cores = Runtime.getRuntime().availableProcessors();
		MyExecutor poolExecutor = new MyExecutor(cores, 2 * cores, 1000, TimeUnit.MILLISECONDS,
				new LinkedBlockingDeque<Runnable>());
		List<List<InterpreterQuery>> queriesList = new ArrayList<List<InterpreterQuery>>();
		List<Future<String>> futures = new ArrayList<Future<String>>();
		List<String> desiredResults = new ArrayList<String>();

		for (int i = 0; i < cores; i++) {
			StringBuilder strBuilder = new StringBuilder();
			List<InterpreterQuery> queries = new ArrayList<InterpreterQuery>();
			for (int j = 0; j < Constants.PARALLEL_SESSIONS; j++) {
				InterpreterQuery query = getRandomQuery(InterpreterType.PYTHON);
				queries.add(j, query);
				strBuilder.append(
						query.getInterpreterCode().replace("x=", "").replace("print x", "").replaceAll("\n", ""));
			}
			queriesList.add(queries);
			desiredResults.add(strBuilder.toString());
		}

		for (int i = 0; i < cores; i++) {
			String sid = UUID.randomUUID().toString();
			MockHttpSession newSession = new MockHttpSession(webApplicationContext.getServletContext(), sid);
			SimulateSessionTask task = new SimulateSessionTask(queriesList.get(i), mvc, this, newSession);
			futures.add(i, poolExecutor.submit(task));
		}
		for (int i = 0; i < cores; i++) {
			futures.get(i).get();
		}
		for (int i = 0; i < cores; i++) {
			String fStr = futures.get(i).get().replaceAll("\n", "");
			String desiStr = desiredResults.get(i);
			assertEquals(fStr, desiStr);
		}

	}

	private InterpreterQuery getRandomQuery(InterpreterType type) {
		InterpreterQuery query = new InterpreterQuery();
		if (type.equals(InterpreterType.PYTHON)) {
			query.setCode(Constants.PYTHONSTARTSTR + "x=" + new Random().nextInt(Integer.MAX_VALUE) + "\nprint x");
		}
		return query;
	}
}
