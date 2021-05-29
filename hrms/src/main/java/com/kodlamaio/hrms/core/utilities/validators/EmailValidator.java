package com.kodlamaio.hrms.core.utilities.validators;

import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;

public class EmailValidator {
	
	public static Result checkIfEmailUsed(String email) {
		return new SuccessResult("Bu Email daha önce kullanılmamış");
	}

}
