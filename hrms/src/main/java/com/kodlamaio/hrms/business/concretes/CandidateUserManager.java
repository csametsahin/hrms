package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.CandidateUserService;
import com.kodlamaio.hrms.core.adapters.abstracts.ICheckService;
import com.kodlamaio.hrms.core.adapters.concretes.MernisCheckService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.ErrorResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.core.utilities.validators.AuthorizationValidater;
import com.kodlamaio.hrms.core.utilities.validators.EmailValidator;
import com.kodlamaio.hrms.dataAccess.abstracts.CandidateUserDao;
import com.kodlamaio.hrms.entities.concretes.CandidateUser;


@Service
public class CandidateUserManager implements CandidateUserService {
	
	CandidateUserDao candidateUserDao;
	 
	
	@Autowired
	public CandidateUserManager(CandidateUserDao candidateUserDao) {
		super();
		this.candidateUserDao = candidateUserDao;
	}



	@Override
	public Result add(CandidateUser candidateUser) {
		  ICheckService checkService = new MernisCheckService();
		  
		  if(!EmailValidator.checkIfEmailUsed(candidateUser.getEmail()).isResult()) {
			  return new ErrorResult("Email Kullanılmış");
		  }
		  else if(!AuthorizationValidater.authValidater(candidateUser).isResult()) {
			  return new ErrorResult("Email onayı yapılmamış");
		  }
		  if(checkService.CheckIfRealUser(candidateUser).isResult()) {
			  candidateUserDao.save(candidateUser);
			  return new SuccessResult("Kullanıcı Başarıyla Kaydedildi");
			  
		  }
		  else {
			  return new ErrorResult("Kullanıcı Mernis Doğrulamasını Geçemedi");
		  }
		  
	
		
	}
	@Override
	public DataResult<List<CandidateUser>> getAll() {
		return new SuccessDataResult<List<CandidateUser>>
		(this.candidateUserDao.findAll(),"Data listelendi");
	}



	

}
