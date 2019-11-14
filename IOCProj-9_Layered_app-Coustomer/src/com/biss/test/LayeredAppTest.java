package com.biss.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.biss.VO.CustomerVO;
import com.biss.controller.CustomerController;

public class LayeredAppTest {

	public static void main(String[] args) {
		CustomerController cc=null;
		Scanner sc=null;
		CustomerVO vo=null;
		BeanFactory factory=null;
		String msg=null;
		//create container
		factory=new XmlBeanFactory(new ClassPathResource("com/biss/cfgs/applicationContext.xml"));
		//get bean class obj
		cc=factory.getBean("controller",CustomerController.class);
		//Read input from user
		sc=new Scanner(System.in);
		vo=new CustomerVO();
		System.out.println("Enter Customer Details:-");
		System.out.println("Customer id:-");
		vo.setCustId(sc.next());
		System.out.println("Customer Name:-");
		vo.setCustName(sc.next());
		System.out.println("customer Princeple amount:-");
		vo.setpAmt(sc.next());
		System.out.println("Interest amount:-");
		vo.setInterestRate(sc.next());
		System.out.println("Time Period:-");
		vo.setTime(sc.next());
		//callbussiness method
		
		try {
			msg=cc.processCustomer(vo);
			System.out.println(msg);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
