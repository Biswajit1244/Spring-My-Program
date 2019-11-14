package com.nt.test;

import java.beans.XMLDecoder;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.cglib.proxy.Factory;

import com.nt.beans.WishMessage;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		WishMessage message=null;
		//Create IOC Container
		factory=new DefaultListableBeanFactory();
		//Give the XML file location
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfng/applicationContext.xml");
		//Get bean class obj
		message=factory.getBean("wmg",WishMessage.class);
		System.out.println(message.wishMessageGenerator("Biswa"));
	}
}
