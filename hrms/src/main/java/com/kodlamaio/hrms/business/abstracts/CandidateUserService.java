package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.CandidateUser;




public interface CandidateUserService {
				Result add(CandidateUser candidateUser);
				DataResult<List<CandidateUser>> getAll();
}
