package com.kodlamaio.hrms.core.utilities.validators;

import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.entities.concretes.User;

public class AuthorizationValidater {
	
	public static Result authValidater(User user) {
		return new SuccessResult("Kullanıcı Mail Onayı Yapmıştır");
	}

}
