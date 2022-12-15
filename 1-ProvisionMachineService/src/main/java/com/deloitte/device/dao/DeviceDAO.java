package com.deloitte.device.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.device.entity.DeviceTable;

@Repository
public interface DeviceDAO extends JpaRepository<DeviceTable, Integer>{

}
