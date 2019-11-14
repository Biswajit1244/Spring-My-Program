package com.biss.DTO;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String empName;
	private String empAddrs;
	private float basicSalary;
	
	
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empAddrs
	 */
	public String getEmpAddrs() {
		return empAddrs;
	}
	/**
	 * @param empAddrs the empAddrs to set
	 */
	public void setEmpAddrs(String empAddrs) {
		this.empAddrs = empAddrs;
	}
	/**
	 * @return the basicSalary
	 */
	public float getBasicSalary() {
		return basicSalary;
	}
	/**
	 * @param basicSalary the basicSalary to set
	 */
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
}
