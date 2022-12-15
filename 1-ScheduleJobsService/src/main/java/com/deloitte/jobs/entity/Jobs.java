package com.deloitte.jobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Jobs {
	
	@Id
	private Integer jobId;
	private String jobName;
	private Integer resourcesRequired;
	private Integer deviceId;
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jobs(Integer jobId, String jobName, Integer resourcesRequired, Integer deviceId) {
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
	@Override
	public String toString() {
		return "Jobs [jobId=" + jobId + ", jobName=" + jobName + ", resourcesRequired=" + resourcesRequired
				+ ", deviceId=" + deviceId + "]";
	}

}
