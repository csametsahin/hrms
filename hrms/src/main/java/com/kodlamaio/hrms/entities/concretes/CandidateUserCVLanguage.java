package com.kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cv_language")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer" ,"handler","userCV" })
public class CandidateUserCVLanguage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="candidate_user_language_id")
	private int id;
	@Column(name="level")
	@Min(value=1, message="Dil seviyeniz 1 den daha küçük olamaz")
	@Max(value=5,message="Dil seviyeniz 5 ten daha büyük olamaz")
	private int level;

	@OneToMany(mappedBy = "language" )
	private List<CandidateUserCV> userCV;
	
	@ManyToOne()
	@JoinColumn(name="language_id")
	private Language language;
	
	
}
