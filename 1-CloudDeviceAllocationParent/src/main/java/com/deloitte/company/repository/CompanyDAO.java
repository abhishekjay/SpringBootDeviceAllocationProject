package com.deloitte.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.company.entity.CompanyTable;

@Repository
public interface CompanyDAO extends JpaRepository<CompanyTable, Integer>{

}
