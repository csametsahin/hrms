package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
			
			@Query("From JobAdvertisement where active=true ")
			List<JobAdvertisement> getActiveJobAdvertisement();
			@Query("From JobAdvertisement where active=true ORDER BY dead_line DESC ")
			List<JobAdvertisement> getActiveJobAdvertisementDESC();
			
			List<JobAdvertisement> getByMasterUser_Id(int master_user_id);
			
			@Query("Update JobAdvertisement set active=?1 where jobadv_id=?2")
			JobAdvertisement setUserActiveById(boolean x,int j_id);
}
