package com.deloitte.device.model;

public class Job {
	
	private Integer jobId;
	private String jobName;
	private Integer resourcesRequired;
	private Integer deviceId;
	
	
	public Job() {
		super();
	}
	
	public Job(Integer jobId, String jobName, Integer resourcesRequired, Integer deviceId) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.resourcesRequired = resourcesRequired;
		this.deviceId = deviceId;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Integer getResourcesRequired() {
		return resourcesRequired;
	}
	public void setResourcesRequired(Integer resourcesRequired) {
		this.resourcesRequired = resourcesRequired;
	}
	public Integer getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

}
