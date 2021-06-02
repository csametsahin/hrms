package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.CandidateUserCV;

public interface CandidateUserCVService {
						Result add(CandidateUserCV cv);
						DataResult<List<CandidateUserCV>> getAllSortedWorkExperience();
						DataResult<List<CandidateUserCV>> getAllSortedSchoolExperience();
}
