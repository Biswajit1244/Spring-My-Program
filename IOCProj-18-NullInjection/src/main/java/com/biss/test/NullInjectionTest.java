package com.biss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.biss.beans.EmployeeDetails;

public class NullInjectionTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		EmployeeDetails emp=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/biss/cfgs/applicationContext.xml"));
		//Get bean class obj
		emp=factory.getBean("emp",EmployeeDetails.class);
		System.out.println(emp);
	}
}
