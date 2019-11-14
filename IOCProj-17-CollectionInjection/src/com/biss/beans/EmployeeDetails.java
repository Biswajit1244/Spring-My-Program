package com.biss.beans;

import java.util.Date;
import java.util.Map;

public class EmployeeDetails {
	private Map<String,String> empDetails;
	private Map<String,Date> date;
	
	public void setEmpDetails(Map<String, String> empDetails) {
		System.out.println(empDetails.getClass());
		this.empDetails = empDetails;
	}
	public void setDate(Map<String, Date> date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [empDetails=" + empDetails + ", date=" + date + "]";
	}
	
}
