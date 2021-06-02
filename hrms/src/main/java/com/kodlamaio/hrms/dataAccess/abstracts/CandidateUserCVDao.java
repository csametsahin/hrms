package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kodlamaio.hrms.entities.concretes.CandidateUserCV;
import com.kodlamaio.hrms.entities.dtos.CVDetail;

public interface CandidateUserCVDao extends JpaRepository<CandidateUserCV, Integer>{
		
		@Query("Select DISTINCT new com.kodlamaio.hrms.entities.dtos.CVDetail(c1.id,c1.github,c1.linkedIn,c1.tech,c1.coverLetter,s.schoolName,s.departmentName,w.companyName,w.position) From CandidateUserCVSchool s Inner Join s.userCv c1 ,CandidateUserWorkExperience w Inner Join w.userCV c2 , CandidateUserCVLanguage l Inner Join l.userCV c3 Where c1.id=:id")
	     List<CVDetail> getCVDetail(int id);
				           
}
