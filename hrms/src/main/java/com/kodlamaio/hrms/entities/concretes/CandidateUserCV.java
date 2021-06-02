package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidate_user_cv")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateUserCV {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
	     private int id;
	    
		@Column(name="github")
	     private String github;
		@Column(name="linkedIn")
	     private String linkedIn;
		@Column(name="tech")
	     private String	tech;
		@Column(name="coverLetter")
	     private String coverLetter;
	    
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="cv_work_id")
		private CandidateUserWorkExperience workExperience;
	     
	     @ManyToOne()
	     @JoinColumn(name="candidate_user_id")
	     private CandidateUser candidateUser;
	     
	     @ManyToOne(cascade = CascadeType.ALL)
	     @JoinColumn(name="cv_school_id")
	     private CandidateUserCVSchool school;
	     
	     @ManyToOne(cascade = CascadeType.ALL)
	     @JoinColumn(name="candidate_user_language_id")
	     private CandidateUserCVLanguage language;
	     

}
