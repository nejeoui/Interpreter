package com.nejeoui.interpreter.concurrency;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.Callable;

import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nejeoui.interpreter.InterpreterApplicationTests;
import com.nejeoui.interpreter.dto.InterpreterQuery;
import com.nejeoui.interpreter.dto.InterpreterResult;

public class SimulateSessionTask implements Callable<String> {
	public static final Object lock=new Object();
	private List<InterpreterQuery> queries;
	private MockMvc mvc;
	private InterpreterApplicationTests currentTest;
	private MockHttpSession session;

	@Override
	public String call() throws Exception {
		String uri = "/exec";
		StringBuilder strb=new StringBuilder();
		for(int i=0;i<queries.size();i++) {
			InterpreterQuery query=queries.get(i);
			String inputJson= currentTest.mapToJson(query);
			MvcResult mvcResult;
			//to adress thread safety problems of MockMvc perform method  
			synchronized(lock) {
				mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).session(session)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
			}

		
		String content = mvcResult.getResponse().getContentAsString();
		InterpreterResult result = currentTest.mapFromJson(content, InterpreterResult.class);
		strb.append(result.getResult());
		Thread.sleep(50);
		}
		return strb.toString();
		
	}

	public SimulateSessionTask(List<InterpreterQuery> queries, MockMvc mvc, InterpreterApplicationTests currentTest,
			MockHttpSession session) {
		super();
		this.queries = queries;
		this.mvc = mvc;
		this.currentTest = currentTest;
		this.session = session;
	}
	
	

}
