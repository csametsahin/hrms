package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.CandidateUserCVService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.entities.concretes.CandidateUserCV;

@RestController
@RequestMapping("/api/candidateusercvs")
public class CandidateUserCvsController {
			CandidateUserCVService candidateUserCVService;
			
			@Autowired
			public CandidateUserCvsController(CandidateUserCVService candidateUserCVService) {
				super();
				this.candidateUserCVService = candidateUserCVService;
			}

			@PostMapping("/add")
			public Result add(@RequestBody CandidateUserCV cv) {
				return this.candidateUserCVService.add(cv);
				
			}
			
			@GetMapping("/getAllSortedWorkExperience")
			public DataResult<List<CandidateUserCV>> getAllSortedWork(){
			    return this.candidateUserCVService.getAllSortedWorkExperience();
			}
			@GetMapping("/getAllSortedSchoolExperience")
			public DataResult<List<CandidateUserCV>> getAllSortedSchool(){
			    return this.candidateUserCVService.getAllSortedSchoolExperience();
			}
			
			
}
