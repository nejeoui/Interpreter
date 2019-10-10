package com.nejeoui.interpreter.exception;

public class NotImplementedException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8164237347679874533L;

	public NotImplementedException() {
		super("Not implemented yet !");
	}

	public NotImplementedException(String msg) {
		super(msg);
	}

}
