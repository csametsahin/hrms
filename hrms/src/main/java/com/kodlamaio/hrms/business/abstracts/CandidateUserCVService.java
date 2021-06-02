package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.CandidateUserCV;
import com.kodlamaio.hrms.entities.dtos.CVDetail;

public interface CandidateUserCVService {
						Result add(CandidateUserCV cv);
						DataResult<List<CandidateUserCV>> getAllSortedWorkExperience();
						DataResult<List<CandidateUserCV>> getAllSortedSchoolExperience();
						DataResult<List<CVDetail>> getAllCVDetail(int id);
}
