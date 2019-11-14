package com.biss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.biss.beans.Flipkart;

public class BeanCollabrationTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart fk=null;

		//Crete container 
		factory=new XmlBeanFactory(new ClassPathResource("com/biss/cfgs/applicationContext.xml"));
		//get the spring bean class obj
		fk=factory.getBean("fkart",Flipkart.class);
		
		//Call business method
		String msg=fk.shopping(new String[] {"mobile","pant"});
		System.out.println(msg);
	}

}
