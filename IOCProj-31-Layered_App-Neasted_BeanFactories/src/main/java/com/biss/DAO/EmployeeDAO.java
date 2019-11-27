package com.biss.DAO;

import java.util.List;

import com.biss.EmployeeBO.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO> getEmpsByDesg(String desg1,String desg2)throws Exception;
}
