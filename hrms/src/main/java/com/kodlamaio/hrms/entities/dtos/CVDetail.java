package com.kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CVDetail {
			private int cv_id;
			private String github;
			private String linkedIn;
			private String coverLetter;
			private String tech;
			private String schoolName;
			private String departmentName;
			private String companyName;
			private String position;
}
