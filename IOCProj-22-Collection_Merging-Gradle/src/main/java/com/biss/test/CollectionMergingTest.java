package com.biss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.biss.beans.Laptop;

public class CollectionMergingTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Laptop simLap=null,AdvLap=null;
		//create IOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/biss/cfgs/applicationContext.xml"));
		simLap=factory.getBean("Simplelaptop",Laptop.class);
		System.out.println(simLap);
		System.out.println("==============================");
		AdvLap=factory.getBean("AdvancedLaptop",Laptop.class);
		System.out.println(AdvLap);
	}

}
