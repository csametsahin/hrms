package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.CandidateUser;

public interface CandidateUserDao extends JpaRepository<CandidateUser, Integer>{

}
