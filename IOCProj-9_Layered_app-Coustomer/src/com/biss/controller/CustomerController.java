package com.biss.controller;

import com.biss.DTO.CustomerDTO;
import com.biss.VO.CustomerVO;
import com.biss.service.CustomerService;

public class CustomerController {
	CustomerService service;
	
	public CustomerController(CustomerService service) {
		System.out.println("CustomerController::1-param constructor");
		this.service=service;
	}
	
	public String processCustomer(CustomerVO vo)throws Exception{
		CustomerDTO dto=null;
		String msg=null;
		//convert vo object DTO obj
		dto=new CustomerDTO();
		dto.setCustId(Integer.parseInt(vo.getCustId()));
		dto.setCustName(vo.getCustName());
		dto.setInterestRate(Float.parseFloat(vo.getInterestRate()));
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setTime(Integer.parseInt(vo.getTime()));
		//use service
		msg=service.customerRegister(dto);
		
		return msg;
	}
}
