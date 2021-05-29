package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.MasterUserService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.MasterUser;

@RestController
@RequestMapping("/api/masterusers")
public class MasterUsersController {
			MasterUserService masterUserService;
			@Autowired
			public MasterUsersController(MasterUserService masterUserService) {
				super();
				this.masterUserService = masterUserService;
			}
			
			@PostMapping("/add")
			public Result add(@RequestBody MasterUser masterUser) {
				 return this.masterUserService.add(masterUser);
			}
			
			@GetMapping("/getAll")
			public DataResult<List<MasterUser>> getAll(){
				 return this.masterUserService.getAll();
			}
}
