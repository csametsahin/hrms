package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.CandidateUserCV;

public interface CandidateUserCVDao extends JpaRepository<CandidateUserCV, Integer>{
				            
}
