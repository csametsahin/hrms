package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.CandidateUserService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.CandidateUser;

@RestController
@RequestMapping("/api/candidateusers")
public class CandidateUsersController {
	
	private CandidateUserService candidateUserService;
	@Autowired
	public CandidateUsersController(CandidateUserService candidateUserService) {
		super();
		this.candidateUserService = candidateUserService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateUser candidateUser) {
		    return candidateUserService.add(candidateUser);
	}
	@GetMapping("/getAll")
	public DataResult<List<CandidateUser>> getAll(){
		   return this.candidateUserService.getAll();
	}
	

}
