package com.nejeoui.interpreter.exception;

public class UnknownInterpreterException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3652082637329221216L;

	public UnknownInterpreterException() {
		super("Uknown interpreter !");
	}

	public UnknownInterpreterException(String msg) {
		super(msg);
	}
}
