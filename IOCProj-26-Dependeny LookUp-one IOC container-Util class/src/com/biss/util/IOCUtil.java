package com.biss.util;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.biss.beans.Cricketer;

public class IOCUtil {
	static DefaultListableBeanFactory factory;
	static{
		XmlBeanDefinitionReader reader=null;
		//create bean factory
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/biss/cfgs/applicationContext.xml");
	}
	public static DefaultListableBeanFactory getContainer() {
		
		return factory;
	}
}
