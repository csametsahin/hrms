package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
				DataResult<List<JobAdvertisement>> getAll();
				DataResult<List<JobAdvertisement>> getActiveJobAdv();
				DataResult<List<JobAdvertisement>> getActiveJobAdvDESC();
				DataResult<List<JobAdvertisement>> getByMasterUserId(int master_user_id);
				Result add(JobAdvertisement jobAdvertisement);
				Result updateActive(boolean x , int j_id);
}
