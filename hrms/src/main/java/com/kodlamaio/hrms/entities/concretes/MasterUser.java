package com.kodlamaio.hrms.entities.concretes;

import java.util.List;

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
@Table(name="master_users")
@Entity
@PrimaryKeyJoinColumn(name="master_user_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer" ,"handler","jobAdvertisements" })
public class MasterUser extends User {
				@Column(name="company_name")
				private String company_name;
				@Column(name="website")
				private String website;
				@Column(name="phone_num")
				private String phone_num;
		
				@OneToMany(mappedBy = "masterUser")
				private List<JobAdvertisement> jobAdvertisements;
}
