package com.deloitte.device.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeviceTable {
	
	@Id
	private Integer deviceId;
	private String deviceName;
	private String deviceManufacturer;
	private Integer deviceQubits;
	public DeviceTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeviceTable(Integer deviceId, String deviceName, String deviceManufacturer, Integer deviceQubits) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceManufacturer = deviceManufacturer;
		this.deviceQubits = deviceQubits;
	}
	public Integer getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceManufacturer() {
		return deviceManufacturer;
	}
	public void setDeviceManufacturer(String deviceManufacturer) {
		this.deviceManufacturer = deviceManufacturer;
	}
	public Integer getDeviceQubits() {
		return deviceQubits;
	}
	public void setDeviceQubits(Integer deviceQubits) {
		this.deviceQubits = deviceQubits;
	}
	@Override
	public String toString() {
		return "DeviceTable [deviceId=" + deviceId + ", deviceName=" + deviceName + ", deviceManufacturer="
				+ deviceManufacturer + ", deviceQubits=" + deviceQubits + "]";
	}

	
	

}
