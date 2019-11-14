package com.biss.VO;

public class CustomerVO {
	
	private String custId;
	private String custName;
	private String pAmt;
	private String interestRate;
	private String time;

	//Setter and getters methods
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getpAmt() {
		return pAmt;
	}
	public void setpAmt(String pAmt) {
		this.pAmt = pAmt;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestAmt) {
		this.interestRate = interestAmt;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
