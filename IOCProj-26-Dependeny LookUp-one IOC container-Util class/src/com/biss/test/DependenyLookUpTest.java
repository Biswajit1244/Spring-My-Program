package com.biss.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.biss.beans.Bat;
import com.biss.beans.Cricketer;
import com.biss.util.IOCUtil;

public class DependenyLookUpTest {

	public static void main(String[] args) {
		Cricketer cric=null;
		DefaultListableBeanFactory factory=null;
		//get container
		factory=IOCUtil.getContainer();
		cric=factory.getBean("cricter",Cricketer.class);
		//call bussiness method
		System.out.println(cric.bating("MS Dhooni"));
		System.out.println(cric.fielding("Team India"));
		System.out.println(cric.bowling("Bumrah"));

	}

}
