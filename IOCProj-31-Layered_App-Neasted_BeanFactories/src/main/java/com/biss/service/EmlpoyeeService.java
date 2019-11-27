package com.biss.service;

import java.util.List;

import com.biss.EmployeeDTO.EmployeeDTO;

public interface EmlpoyeeService {
	public List<EmployeeDTO> fetchEmpDetailByDesgs(String desg1,String desg2)
									throws Exception;
}
