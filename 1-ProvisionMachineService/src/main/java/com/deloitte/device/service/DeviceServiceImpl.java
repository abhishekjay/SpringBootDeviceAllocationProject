package com.deloitte.device.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.device.dao.DeviceDAO;
import com.deloitte.device.entity.DeviceTable;

@Service
public class DeviceServiceImpl implements DeviceService {
	
	@Autowired
	private DeviceDAO deviceDAO;

	@Override
	public DeviceTable getDevice(Integer id) {
		return deviceDAO.findById(id).get();
	}

	@Override
	public List<DeviceTable> getDevices() {
		return deviceDAO.findAll();
	}

}
