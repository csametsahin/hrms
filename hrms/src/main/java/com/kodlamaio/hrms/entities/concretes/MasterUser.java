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
@Table(name="master_users")
@Entity
@PrimaryKeyJoinColumn(name="master_user_id",referencedColumnName = "id")
public class MasterUser extends User {
				@Column(name="company_name")
				private String company_name;
				@Column(name="website")
				private String website;
				@Column(name="phone_num")
				private String phone_num;
			
	
}
