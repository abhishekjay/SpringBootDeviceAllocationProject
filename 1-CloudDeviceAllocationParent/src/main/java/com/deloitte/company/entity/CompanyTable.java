package com.deloitte.company.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CompanyTable {
	
	@Id
	private int companyId;
	private String companyName;
	public CompanyTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyTable(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "CompanyTable [companyId=" + companyId + ", companyName=" + companyName + "]";
	}
	
	
	

}
