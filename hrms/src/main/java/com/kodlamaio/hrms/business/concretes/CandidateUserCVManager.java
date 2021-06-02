package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.CandidateUserCVService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.CandidateUserCVDao;
import com.kodlamaio.hrms.entities.concretes.CandidateUserCV;

@Service
public class CandidateUserCVManager implements CandidateUserCVService {
					CandidateUserCVDao userCVDao;
					
					
					@Autowired
					public CandidateUserCVManager(CandidateUserCVDao userCVDao) {
						super();
						this.userCVDao = userCVDao;
					}


					@Override
					public Result add(CandidateUserCV cv) {
						this.userCVDao.save(cv);
					    return new SuccessResult();
					}


					@Override
					public DataResult<List<CandidateUserCV>> getAllSortedWorkExperience() {
						Sort sort = Sort.by(Sort.Direction.DESC, "workExperience.endDate");
						return new SuccessDataResult<List<CandidateUserCV>>(this.userCVDao.findAll(sort));
					}


					@Override
					public DataResult<List<CandidateUserCV>> getAllSortedSchoolExperience() {
						Sort sort = Sort.by(Sort.Direction.DESC, "school.endYear");
						return new SuccessDataResult<List<CandidateUserCV>>(this.userCVDao.findAll(sort));
					}
					
}
