package com.biss.service;

import com.biss.BO.CustomerBo;
import com.biss.DAO.CustomerDAO;
import com.biss.DTO.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAO dao;
	
	public CustomerServiceImpl(CustomerDAO dao) {
		System.out.println("CustomerServiceImpl::1-param constructor");
		this.dao=dao;
	}
	@Override
	public String customerRegister(CustomerDTO dto) throws Exception {
		float intrstAmt=0.0f;
		CustomerBo bo=null;
		int count =0;
		
		//calculate simple interest
		intrstAmt=(dto.getpAmt()*dto.getTime()*dto.getInterestRate())/100.0f;
		//set BO class obj data
		bo=new CustomerBo();
		bo.setCid(dto.getCustId());
		bo.setCname(dto.getCustName());
		bo.setPamt(dto.getpAmt());
		bo.setInterestAmt(intrstAmt);
		//
		count=dao.insert(bo);
		if(count==0)
			return "Registration Not Succesful but Interest="+intrstAmt;
		else
			return "Registration Succesful Interest amt="+intrstAmt;
	}

}
