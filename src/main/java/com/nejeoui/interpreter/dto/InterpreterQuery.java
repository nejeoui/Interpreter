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

	public String getInterpreterCode(InterpreterType interpreterType) {

		switch (interpreterType) {
		case PYTHON:
			if (code != null && code.startsWith("%python ")) {
				return code.substring(8);
			}
		default:
			return "";
		}

	}

}
