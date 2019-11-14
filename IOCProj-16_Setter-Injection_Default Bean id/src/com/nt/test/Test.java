package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessage;

public class Test {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		
		//locate the spring config file
		res=new FileSystemResource("src/com/nt/cfng/applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		
		//get beans
		WishMessage msg=(WishMessage)factory.getBean("com.nt.beans.WishMessage");
		
		//call bussiness method
		String message=msg.wishMessageGenerator("Biswa");
		System.out.println(message);
	}
}
