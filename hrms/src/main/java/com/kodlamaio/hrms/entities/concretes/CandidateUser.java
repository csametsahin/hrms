package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidate_users")
@Entity
@PrimaryKeyJoinColumn(name ="candidate_user_id",referencedColumnName = "id")
public class CandidateUser extends User {
						@Column(name="name")
						private String name;
						
						@Column(name="surname")
						private String surname;
						
						@Column(name="nationality_id")
						private String nationality_id;

				
				
			
}
