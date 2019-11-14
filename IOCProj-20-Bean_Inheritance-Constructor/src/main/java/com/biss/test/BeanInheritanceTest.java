package com.biss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.biss.beans.MobileInfo;

public class BeanInheritanceTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		MobileInfo mob1=null,mob2=null;
		//create IOC container 
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/biss/cfgs/applicationContext.xml"));
		//Get bean class obj
		mob1=factory.getBean("mob1",MobileInfo.class);
		System.out.println(mob1);
		System.out.println("=======================");
//		mob2=factory.getBean("mob2",MobileInfo.class);
//		System.out.println(mob2);

		
	}

}
