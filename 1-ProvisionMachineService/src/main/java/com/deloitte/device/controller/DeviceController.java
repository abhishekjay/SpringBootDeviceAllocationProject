package com.deloitte.device.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.device.entity.DeviceTable;
import com.deloitte.device.model.Job;
import com.deloitte.device.model.Response;
import com.deloitte.device.service.DeviceService;

@RestController
@RequestMapping("/device")
public class DeviceController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DeviceService deviceService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Response> getDevice(@PathVariable("id") Integer id) {
		
		DeviceTable device = deviceService.getDevice(id);
		List<Job> jobsList = restTemplate.getForObject("http://localhost:8082/jobs/getJobs/"+id,List.class);
		Response response = new Response(device,jobsList);
		
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@GetMapping("/getdevice")
	public ResponseEntity<List<DeviceTable>> getCustomers(){
		
		List<DeviceTable> deviceList =  deviceService.getDevices();
		return new ResponseEntity<List<DeviceTable>>(deviceList,HttpStatus.OK);
		
	}

}
