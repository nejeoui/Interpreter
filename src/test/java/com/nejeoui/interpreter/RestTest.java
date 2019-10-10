package com.nejeoui.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nejeoui.interpreter.dto.InterpreterQuery;
import com.nejeoui.interpreter.dto.InterpreterResult;

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

		mvc.perform(MockMvcRequestBuilders.post(uri).session(session).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

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
}
