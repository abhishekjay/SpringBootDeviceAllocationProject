package com.deloitte.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.company.entity.CompanyTable;
import com.deloitte.company.model.Device;
import com.deloitte.company.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private CompanyService companyService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Response> getCompany(@PathVariable("id") Integer id) {
		
		CompanyTable company = companyService.getCompany(id);
		List<Device> jobsList = restTemplate.getForObject("http://localhost:8082/jobs/getJobs/"+id,List.class);
		Response response = new Response(device,jobsList);
		
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}

}
