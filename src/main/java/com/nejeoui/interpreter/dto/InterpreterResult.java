package com.nejeoui.interpreter.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * An InterpreterResult {@code InterpreterResult} 
 * <p>
 * used as a Data Transfer Object to store the PythonInterpreter execution result 
 * <p>
 *
 * @author <a href="mailto:a.nejeoui@gmail.com">Abderrazzak Nejeoui</a>
 * @see PythonInterpreter
 * @see InterpreterQuery
 * @since 1.0
 */
public class InterpreterResult {
	private String result;

	public InterpreterResult() {
		super();
	}

	@JsonCreator
	public InterpreterResult(@JsonProperty("result") String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}


