package com.deloitte.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.company.entity.CompanyTable;
import com.deloitte.company.repository.CompanyDAO;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyDAO companyDAO;

	@Override
	public CompanyTable getCompany(Integer id) {
		return companyDAO.findById(id).get();
	}

	@Override
	public List<CompanyTable> getCompanies() {
		return companyDAO.findAll();
	}

}
