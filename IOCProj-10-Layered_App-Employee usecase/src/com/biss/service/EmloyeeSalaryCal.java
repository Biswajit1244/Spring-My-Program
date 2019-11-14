package com.biss.service;

import com.biss.BO.EmployeeBO;
import com.biss.DAO.EmloyeeDAO;
import com.biss.DTO.EmployeeDTO;

public final class EmloyeeSalaryCal implements EmployeeService {
	EmloyeeDAO dao;
	
	public EmloyeeSalaryCal(EmloyeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calculateSalary(EmployeeDTO dto) throws Exception {
		float grossSalary=0.0f,netSalary=0.0f;
		EmployeeBO bo=null;
		int count=0;
		grossSalary=dto.getBasicSalary()+(dto.getBasicSalary()*0.2f);
		netSalary=grossSalary-(grossSalary*0.1f);
		//set BO obj data
		bo=new EmployeeBO();
		bo.setEmpId(dto.getEmpId());
		bo.setEmpName(dto.getEmpName());
		bo.setEmpAddrs(dto.getEmpAddrs());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		//call DAO class method
		count=dao.insert(bo);
		if(count==0)
			return "Employeee Registration failed";
		else
			return "Employee details registration Succesful \n"
					+ "Gross salary="+grossSalary+"\nNet Salary="+netSalary;
	}

}
