package com.kodlamaio.hrms.core.utilities.results;

public class DataResult<T> extends Result {

	T data;

	public DataResult(boolean result, T data) {
		super(result);
		this.data = data;
	}
	
	public DataResult(boolean result, T data,String message) {
		super(result,message);
		this.data = data;
	}

	public T getData() {
		return data;
	}
	

	
	
}
