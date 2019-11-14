package com.biss.beans;

public class EmployeeDetails {
	private String eName;
	private String compName;
	private String addrs;
	private float salary;
	
	public EmployeeDetails(String eName, String compName, String addrs, float salary) {
		this.eName = eName;
		this.compName = compName;
		this.addrs = addrs;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [eName=" + eName + ", compName=" + compName + ", addrs=" + addrs + ", salary=" + salary
				+ "]";
	}
	
}
