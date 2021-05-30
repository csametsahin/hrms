package com.kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}


	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		 return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll());
	}


	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı başarıyla eklendi");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getActiveJobAdv() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getActiveJobAdvertisement());
	}


	@Override
	public DataResult<List<JobAdvertisement>> getActiveJobAdvDESC() {
		 return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getActiveJobAdvertisementDESC());
	}


	@Override
	public DataResult<List<JobAdvertisement>> getByMasterUserId(int master_user_id) {
		 return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByMasterUser_Id(master_user_id));
	}


	@Override
	public Result updateActive(boolean x, int j_id) {
		this.jobAdvertisementDao.setUserActiveById(x, j_id);
		return new SuccessResult("Başarıyla Güncellendi");
	}

}
