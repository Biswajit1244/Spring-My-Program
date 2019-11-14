package com.biss.DTO;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int custId;
	private String custName;
	private float pAmt;
	private float interestRate;
	private int time;
	
	//Setters and Getters Methods
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public float getpAmt() {
		return pAmt;
	}
	public void setpAmt(float pAmt) {
		this.pAmt = pAmt;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestAmt) {
		this.interestRate = interestAmt;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
}
