package com.biss.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.biss.beans.TravleAgency;

public class AutoWiringTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		TravleAgency ta=null;
		//Create container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/biss/cfgs/applicationContext.xml");
		//getBean class obj
		ta=factory.getBean("TA",TravleAgency.class);
		System.out.println(ta);
	}

}
