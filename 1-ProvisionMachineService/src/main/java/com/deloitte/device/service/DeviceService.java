package com.deloitte.device.service;

import java.util.List;

import com.deloitte.device.entity.DeviceTable;

public interface DeviceService {
	
	public DeviceTable getDevice(Integer id);
	public List<DeviceTable> getDevices();

}
