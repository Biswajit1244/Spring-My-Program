package com.biss.EmployeeDTO;

public class EmployeeDTO {
	int empNO;
	String empName;
	int mgr;
	float sal;
	int deptNo;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public int getEmpNO() {
		return empNO;
	}
	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empNO=" + empNO + ", empName=" + empName + ", mgr=" + mgr + ", sal=" + sal + ", deptNo="
				+ deptNo + "]";
	}
	
}
