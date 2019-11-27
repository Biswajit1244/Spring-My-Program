package com.biss.controller;

import java.util.Iterator;
import java.util.List;

import com.biss.EmployeeDTO.EmployeeDTO;
import com.biss.EmployeeVO.EmployeeVO;
import com.biss.service.EmployeeServiceImpl;

public class MainController {
	EmployeeServiceImpl serv;
	public MainController(EmployeeServiceImpl serv) {
		this.serv=serv;
	}
	public List<EmployeeDTO> getEmpDetails(String des1,String des2)throws Exception{
		List<EmployeeDTO> listDto=null;
		//Use Service class method
		listDto=serv.fetchEmpDetailByDesgs(des1, des2);
		return listDto;	
	}
	
}
