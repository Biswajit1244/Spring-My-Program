package com.biss.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.biss.beans.Bat;
import com.biss.beans.Cricketer;

public class DependenyLookUpTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Cricketer cric=null;
		//create bean factory
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/biss/cfgs/applicationContext.xml");
		cric=factory.getBean("cricter",Cricketer.class);
		//call bussiness method
		System.out.println(cric.bating("MS Dhooni"));
		System.out.println(cric.fielding("Team India"));
		System.out.println(cric.bowling("Bumrah"));

	}

}
