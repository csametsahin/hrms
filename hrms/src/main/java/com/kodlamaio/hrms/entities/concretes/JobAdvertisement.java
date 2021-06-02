package com.kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_advertisement")
@Entity
public class JobAdvertisement {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name="id")
			private int jobadv_id;
			@Column(name="job_details")
			private String job_details;
		
			
			@Column(name="min_salary")
			private long min_salary;
			@Column(name="max_salary")
			private long max_salary;
			@Column(name="open_positions")
			private short open_positions;
			@Column(name="dead_line")
			private Date dead_line;
			@Column(name="jobadv_activate")
			private boolean active;
			//idleri city_id ile değiştirip insertable false updatable false kaldır ve manytoOne da cascadetype oluştur
			@ManyToOne()
			@JoinColumn(name="id",insertable = false,updatable =false)
			private City city;
			
			@ManyToOne()
			@JoinColumn(name="id",insertable=false,updatable = false)
			private Job job;
			
			@ManyToOne()
			@JoinColumn(name="master_user_id")
			private MasterUser masterUser; 
			
			
}
