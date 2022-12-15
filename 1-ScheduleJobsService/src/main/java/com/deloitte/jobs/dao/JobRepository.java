package com.deloitte.jobs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.jobs.entity.Jobs;

@Repository
public interface JobRepository extends JpaRepository<Jobs, Integer>{
	
	List<Jobs> findByDeviceId(Integer deviceId);

}
