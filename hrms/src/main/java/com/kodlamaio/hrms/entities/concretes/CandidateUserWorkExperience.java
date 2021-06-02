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
@Table(name="cv_work")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer" ,"handler","userCV" })
public class CandidateUserWorkExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cv_work_id")
	private int id;
	@Column(name="company_name")
	private String companyName;
	@Column(name="position")
	private String position;
	@Column(name="start_date")
	private LocalDate startDate;
	@Column(name="end_date",nullable = true)
	private LocalDate endDate;
	
	@OneToMany(mappedBy = "workExperience", cascade = CascadeType.ALL)
	private List<CandidateUserCV> userCV;

}
