package com.kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cv_school")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer" ,"handler","userCv" })
public class CandidateUserCVSchool {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="cv_school_id")
	 private int id;
	@Column(name="school_name")
	 private String schoolName;
	@Column(name="department_name")
     private String departmentName;
	@Column(name="start_year")
     private LocalDate startYear;
	@Column(name="end_year" , columnDefinition = "varchar(255) default 'Devam Ediyor'")
     private LocalDate endYear;
     
     @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
     private List<CandidateUserCV> userCv;
     
     

}
