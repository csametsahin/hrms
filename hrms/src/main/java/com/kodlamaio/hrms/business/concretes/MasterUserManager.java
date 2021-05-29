package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.MasterUserService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.ErrorResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.core.utilities.validators.AuthorizationValidater;
import com.kodlamaio.hrms.core.utilities.validators.EmailValidator;
import com.kodlamaio.hrms.dataAccess.abstracts.MasterUserDao;
import com.kodlamaio.hrms.entities.concretes.MasterUser;

@Service
public class MasterUserManager implements MasterUserService {
	MasterUserDao masterUserDao;
	@Autowired
	public MasterUserManager(MasterUserDao masterUserDao) {
		super();
		this.masterUserDao = masterUserDao;
	}

	@Override
	public Result add(MasterUser masterUser) {
		if(!AuthorizationValidater.authValidater(masterUser).isResult()) {
			return new ErrorResult("Mail onayı yapılmamıştır");
		}
		else if(!EmailValidator.checkIfEmailUsed(masterUser.getEmail()).isResult()) {
			return new ErrorResult("Bu mail kullanılmıştır");
		}
		masterUserDao.save(masterUser);
		return new SuccessResult("Başarıyla iş veren eklendi");
	}

	@Override
	public DataResult<List<MasterUser>> getAll() {
		 return new SuccessDataResult<List<MasterUser>>(masterUserDao.findAll(),"Data dönüyorum");
	}



	


}
