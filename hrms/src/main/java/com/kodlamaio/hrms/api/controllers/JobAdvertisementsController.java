package com.kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
				private JobAdvertisementService jobAdvertisementService;
				@Autowired
				public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
					super();
					this.jobAdvertisementService = jobAdvertisementService;
				}
				
				@GetMapping("/getAll")
				public DataResult<List<JobAdvertisement>> getAll(){
					return this.jobAdvertisementService.getAll();
				}
				@GetMapping("/getAllActive")
				public DataResult<List<JobAdvertisement>> getActiveJobAdv(){
					return this.jobAdvertisementService.getActiveJobAdv();
				}
				
				@PostMapping("/add")
				public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
					return this.jobAdvertisementService.add(jobAdvertisement);
				}
				@GetMapping("/getAllActiveDesc")
				public DataResult<List<JobAdvertisement>> getActiveJobAdvDESC(){
					return this.jobAdvertisementService.getActiveJobAdvDESC();
				}
				@GetMapping("/getByMasterUserId")
				public DataResult<List<JobAdvertisement>> getByMasterUserId(@RequestParam int master_user_id){
					return this.jobAdvertisementService.getByMasterUserId(master_user_id);
				}
				@PostMapping("/updateActiveById")
				public Result updateActive(@RequestParam boolean x , @RequestParam int j_id) {
					return this.jobAdvertisementService.updateActive(x, j_id);
				}
}
