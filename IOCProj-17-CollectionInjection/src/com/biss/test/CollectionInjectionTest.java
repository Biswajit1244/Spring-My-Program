package com.biss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.biss.beans.EmployeeDetails;
import com.biss.beans.ExamMark_Array;
import com.biss.beans.PersonInfo_List;
import com.biss.beans.Student_Set;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		BeanFactory fact=null;
		ExamMark_Array mark=null;
		PersonInfo_List list=null;
		Student_Set student=null;
		EmployeeDetails emp=null;
		//Creagte IOC container
		fact=new XmlBeanFactory(new ClassPathResource("com/biss/cfgs/applicationContext.xml"));
		//get the bean class obj
		mark=fact.getBean("mark",ExamMark_Array.class);
		System.out.println(mark);
		System.out.println("----------------------");
		list=fact.getBean("person",PersonInfo_List.class);
		System.out.println(list);
		System.out.println("======================");
		student=fact.getBean("stud",Student_Set.class);
		System.out.println(student);
		System.out.println("=====================")		;
		emp=fact.getBean("emp",EmployeeDetails.class);
		System.out.println(emp);
	}

}
