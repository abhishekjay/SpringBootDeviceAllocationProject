package com.deloitte.jobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.jobs.dao.JobRepository;
import com.deloitte.jobs.entity.Jobs;

@RestController
@RequestMapping("/jobs")
public class JobController {
	
	@Autowired
	private JobRepository jobRepository;
	
	@GetMapping("/getJobs")
	public ResponseEntity<List<Jobs>> getJobs() {
		List<Jobs> jobsList = jobRepository.findAll();
		
		return new ResponseEntity<List<Jobs>>(jobsList, HttpStatus.OK);
	}
	
	@GetMapping("/getJobs/{deviceId}")
	public ResponseEntity<List<Jobs>> getJobById(@PathVariable("deviceId") Integer deviceId) {
		List<Jobs> jobList = jobRepository.findByDeviceId(deviceId);
		return new ResponseEntity<List<Jobs>>(jobList, HttpStatus.OK);
	}
	
//	@GetMapping("/getJobs/{jobId}")
//	public ResponseEntity<List<Jobs>> getJobById(@PathVariable("deviceId") Integer deviceId) {
//		List<Jobs> jobList = jobRepository.findByDeviceId(deviceId);
//		return new ResponseEntity<List<Jobs>>(jobList, HttpStatus.OK);
//	}

}
