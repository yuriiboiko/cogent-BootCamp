package com.cogent.exception;

public class MandatoryFieldException extends RuntimeException{
	private String errorMessage;

	public MandatoryFieldException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	};
	

}
