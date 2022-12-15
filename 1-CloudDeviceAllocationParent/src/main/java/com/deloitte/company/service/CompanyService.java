package com.deloitte.company.service;

import java.util.List;

import com.deloitte.company.entity.CompanyTable;

public interface CompanyService {
	
	public CompanyTable getCompany(Integer id);
	public List<CompanyTable> getCompanies();

}
