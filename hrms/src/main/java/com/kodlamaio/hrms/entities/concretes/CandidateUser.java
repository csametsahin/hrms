package com.kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidate_users")
@Entity
@PrimaryKeyJoinColumn(name ="candidate_user_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer" ,"handler","candidateUserCV" })
public class CandidateUser extends User {
						@Column(name="name")
						private String name;
						
						@Column(name="surname")
						private String surname;
						
						@Column(name="nationality_id")
						private String nationality_id;

						
						
						@OneToMany(mappedBy = "candidateUser", cascade = CascadeType.ALL)
						private List<CandidateUserCV> candidateUserCV;
						
						@OneToMany(mappedBy = "candidateUser")
						private List<Image> image;
				
			
}
