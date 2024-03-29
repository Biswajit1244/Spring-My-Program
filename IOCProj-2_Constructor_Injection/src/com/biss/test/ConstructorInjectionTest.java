package com.biss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.biss.beans.WishMessage;

public class ConstructorInjectionTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BeanFactory factory=null;
		WishMessage msg=null;
		
		//create IOC container
		//factory=new XmlBeanFactory
				//(new FileSystemResource("src/com/biss/cfgs/applicationContext.xml"));
		
		//OR
		
		//create IOC container
		factory =new XmlBeanFactory
				(new ClassPathResource("com/biss/cfgs/applicationContext.xml"));
		
//		//get beans
//		msg=(WishMessage)factory.getBean("wmg");
//		
//		//call bussiness method
//		String message=msg.wishMessageGenerator("Biswa");
		
		//OR(by using new signature of getBean()
		
		//get spring bean obj
		msg=factory.getBean("wmg",WishMessage.class);
		String message=msg.wishMessageGenerator("Biswa");
		System.out.println("Result:-"+message);
	}
}
