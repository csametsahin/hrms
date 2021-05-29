package com.kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.MasterUser;

public interface MasterUserDao extends JpaRepository<MasterUser, Integer>{

}
