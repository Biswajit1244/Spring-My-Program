package com.biss.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.biss.DAO.EmployeeDAO;
import com.biss.EmployeeBO.EmployeeBO;
import com.biss.EmployeeDTO.EmployeeDTO;

public class EmployeeServiceImpl implements EmlpoyeeService {
	EmployeeDAO dao;
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao=dao;
	}
	@Override
	public List<EmployeeDTO> fetchEmpDetailByDesgs(String desg1, String desg2) throws Exception {
		List<EmployeeBO> listBO=null;
		Iterator itr=null;
		EmployeeDTO dto=null;
		EmployeeBO bo=null;
		List<EmployeeDTO> listDto=null;
		//use DAO class obj
		listBO=dao.getEmpsByDesg(desg1, desg2);
		//convert BO to DTO
		itr=listBO.iterator();
		listDto=new ArrayList<EmployeeDTO>();
		while(itr.hasNext()) {
			dto=new EmployeeDTO();
			bo=(EmployeeBO) itr.next();
			dto.setEmpNO(bo.getEmpNO());
			dto.setEmpName(bo.getEmpName());
			dto.setMgr(bo.getMgr());
			dto.setSal(bo.getSal());
			dto.setDeptNo(bo.getDeptNo());
			//add to Dto collection
			listDto.add(dto);
		}
		return listDto;
	}

}
