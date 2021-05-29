package com.kodlamaio.hrms.core.adapters.concretes;

import com.kodlamaio.hrms.core.adapters.abstracts.ICheckService;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.entities.concretes.User;

public class MernisCheckService implements ICheckService{

	@Override
	public Result CheckIfRealUser(User user) {
		 return new SuccessResult("Kullanıcı başarıyla eklendi");
	}

	

}
