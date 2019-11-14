package com.biss.controller;

import com.biss.DTO.EmployeeDTO;
import com.biss.VO.EmployeeVO;
import com.biss.service.EmployeeService;

public final class MainController {
	EmployeeService service;
	
	public MainController(EmployeeService service) {
		this.service = service;
	}

	public String processRequest(EmployeeVO vo)throws Exception {
		String msg=null;
		EmployeeDTO dto=null;
		//Convert Vo data to DTO obj data
		dto=new EmployeeDTO();
		dto.setEmpName(vo.getEmpName());
		dto.setEmpAddrs(vo.getEmpAddrs());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		//send vo ob
		msg=service.calculateSalary(dto);

		return msg;
	}
}
