package com.biss.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Cricketer {
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}
	
	public String bowling(String name) {
		return name+" is bowling";
	}
	public String fielding(String name) {
		return name+" is fielding";
	}
	
	public String bating(String name) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Bat bat=null;;
		//create bean factory
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/biss/cfgs/applicationContext.xml");
		bat=factory.getBean(beanId,Bat.class);
		
		return name+" is batting with " +bat.DSBat();
		
	}
}
