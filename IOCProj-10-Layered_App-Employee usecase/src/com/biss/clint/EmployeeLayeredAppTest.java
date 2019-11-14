package com.biss.clint;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.biss.VO.EmployeeVO;
import com.biss.controller.MainController;

public class EmployeeLayeredAppTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		MainController cntrlr=null;
		Scanner sc=null;
		EmployeeVO vo=null;
		//Create IOC Container 
		factory=new XmlBeanFactory(new ClassPathResource("com/biss/cfgs/applicationContext.xml"));
		//get Bean class obj
		cntrlr=factory.getBean("controller",MainController.class);
		//get input value 
		sc=new Scanner(System.in);
		vo=new EmployeeVO();
		System.out.println("----Enter Employee Details----");
		System.out.print("Enter Employee id:");
		vo.setEmpId(sc.next());
		System.out.print("Enter employee Name:");
		vo.setEmpName(sc.next());
		System.out.print("Enter Employee Address:");
		vo.setEmpAddrs(sc.next());
		System.out.print("Enter Salary:");
		vo.setBasicSalary(sc.next());
		
		try {
			System.out.println(cntrlr.processRequest(vo));
		} catch(SQLException se) {
			se.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
