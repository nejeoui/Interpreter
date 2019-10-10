package com.nejeoui.interpreter.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An InterpreterQuery {@code InterpreterQuery}
 * <p>
 * used as a Data Transfer Object to store the user query
 * <p>
 *
 * @author <a href="mailto:a.nejeoui@gmail.com">Abderrazzak Nejeoui</a>
 * @see PythonInterpreter
 * @see InterpreterResult
 * @since 1.0
 */
public class InterpreterQuery {
	private String code;
	/*
	 * Hard coded sessionId to give the user access to her/his session' Interpreter
	 */
	private String sessionId;

	public InterpreterQuery() {
		super();
	}

	@JsonCreator
	public InterpreterQuery(@JsonProperty("code") String code) {

		this.code = code;

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getInterpreterCode() {

		switch (getInterpreterType()) {
		case PYTHON:
				return code.substring(Constants.PYTHONSTART);
		case SQL:
			return code.substring(Constants.SQLSTART);
			
		default:
			return "";
		}

	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public InterpreterType getInterpreterType() {
		if (code == null || code.length() < 3 || code.indexOf(" ") == -1)
			return InterpreterType.UNKNOWN;
		String start = code.substring(1, code.indexOf(" "));
		if (start == null || start.length() == 0)
			return InterpreterType.UNKNOWN;
		switch (start.toLowerCase()) {
		case "python":
			return InterpreterType.PYTHON;
		case "sql":
			return InterpreterType.SQL;
		default:
			return InterpreterType.UNKNOWN;
		}
	}

}
