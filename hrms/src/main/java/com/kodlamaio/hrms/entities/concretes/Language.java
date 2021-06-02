package com.kodlamaio.hrms.entities.concretes;

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
@Table(name="language")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer" ,"handler","CVlanguage" })
public class Language {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="language_id")
	private int id;
	@Column(name="language")
	private String language;
	
	@OneToMany(mappedBy = "language", cascade = CascadeType.ALL)
	private List<CandidateUserCVLanguage> CVlanguage;

}
