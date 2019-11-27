package com.biss.test;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.biss.EmployeeDTO.EmployeeDTO;
import com.biss.controller.MainController;

public class NestedBeanFactoryTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=null;
		String desg1=null,desg2=null;
		BeanFactory pFactory=null,cFactory=null;
		MainController controller=null;
		List<EmployeeDTO> dtolist=null;
		Iterator itr=null;
		EmployeeDTO dto=null;
		//Read value from
		sc=new Scanner(System.in);
		System.out.println("Enter 1st Desg:");
		desg1=sc.next();
		System.out.println("Enter 2nd Desg:");
		desg2=sc.next();
		//create IOC container
		pFactory=new XmlBeanFactory(new ClassPathResource("com/biss/cfgs/bussiness-bean.xml"));
		cFactory=new XmlBeanFactory(new ClassPathResource("com/biss/cfgs/presentation-bean.xml"),pFactory);
		//get bean class object
		controller=cFactory.getBean("cntrl",MainController.class);
		try {
			//use controller class method
			dtolist=controller.getEmpDetails(desg1, desg2);
			itr=dtolist.iterator();
			while(itr.hasNext()) {
				dto=(EmployeeDTO) itr.next();
				System.out.println(dto);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//main

}//class
