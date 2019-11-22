package com.biss.test;

import java.io.Console;
import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Calendar cal=null;
		@SuppressWarnings("rawtypes")
		Class cls=null;
		Properties prop=null;
		String str1=null,str2=null;
		//Create container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/biss/cfgs/applicationContext.xml");
		//get bean class objs
		cal=factory.getBean("cal",Calendar.class);
		System.out.println(cal);
		System.out.println("-------------------");
		cls=factory.getBean("clazz",Class.class);
		System.out.println(cls+" "+cls.getClass());
		System.out.println("===================");
		prop=factory.getBean("property",Properties.class);
		System.out.println(prop);
		System.out.println("====================");
		str1=factory.getBean("String", String.class);
		System.out.println(str1);
		System.out.println("====================");
		str2=factory.getBean("String1",String.class);
		System.out.println(str2);
		
	}

}
