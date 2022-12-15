package com.deloitte.company.model;

import java.util.List;

import com.deloitte.device.entity.DeviceTable;

public class Response {
	
	private DeviceTable device;
	private List<Job> jobs;
	
	public Response() {
		super();
	}
	public Response(DeviceTable device, List<Job> jobs) {
		super();
		this.device = device;
		this.jobs = jobs;
	}
	
	public DeviceTable getDevice() {
		return device;
	}
	
	public void setDevice(DeviceTable device) {
		this.device = device;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

}
