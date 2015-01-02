package com.cognizant.cab.exception;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	public ApplicationException() {
		super();
	}

	public ApplicationException(String param) {
		super(param);
	}

	public ApplicationException(Throwable throwable) {
		super(throwable);
	}

	public ApplicationException(String param, Throwable throwable) {
		super(param, throwable);
	}
}
