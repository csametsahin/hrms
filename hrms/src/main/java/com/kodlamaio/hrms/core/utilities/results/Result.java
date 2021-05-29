package com.kodlamaio.hrms.core.utilities.results;

public class Result {
	private boolean result;
	private String message;
	
	
	public Result(boolean result) {
		this.result = result;
	}


	public Result(boolean result, String message) {
		this(result);
		this.message = message;
	}


	public boolean isResult() {
		return result;
	}


	public String getMessage() {
		return message;
	}
	

}
