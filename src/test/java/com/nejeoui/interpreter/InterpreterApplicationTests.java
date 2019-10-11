package com.nejeoui.interpreter;

import java.io.IOException;
import java.util.UUID;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@WebAppConfiguration
@SpringBootTest(classes = InterpreterApplication.class)
public class InterpreterApplicationTests {

	/**
	 * Self4j Logger
	 */
	private static transient Logger logger = LoggerFactory.getLogger(InterpreterApplicationTests.class);

	protected MockMvc mvc;
	protected MockHttpSession session;
	@Autowired
	WebApplicationContext webApplicationContext;

	@Before
	   public void setUp() {
	      mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	      String sid=UUID.randomUUID().toString();
	      session = new MockHttpSession(webApplicationContext.getServletContext(),sid );
	      logger.info("Session ID ="+sid);
	      
	   }

	public String mapToJson(Object obj) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(obj);
	}

	public <T> T mapFromJson(String json, Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(json, clazz);
	}

}
