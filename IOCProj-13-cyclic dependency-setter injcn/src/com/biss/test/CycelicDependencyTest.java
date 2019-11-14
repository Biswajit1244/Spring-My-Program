package com.biss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.biss.beans.A;

public class CycelicDependencyTest {

	public static void main(String[] args) {
		BeanFactory facyory=null;
		
		facyory=new XmlBeanFactory(new ClassPathResource("com/biss/cfgs/applicationContext.xml"));
		A a=facyory.getBean("ac",A.class);
		

	}

}
