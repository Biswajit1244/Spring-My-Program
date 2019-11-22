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
		WishMessage msg1=null,msg2=null;
		
		//locate the spring config file
		res=new FileSystemResource("src/com/nt/cfng/applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		
		//get beans
		msg1=(WishMessage)factory.getBean("wmg");
		msg2=factory.getBean("wmg",WishMessage.class);
		//Check Single ton or not
		/*It give equal value if scope attribute is singleton or not difined
		 * otherwise  it will give diff obj if the scope attribute is prototype
		 */
		System.out.println(msg1.hashCode()+" "+msg2.hashCode());
		
		//call bussiness method
		String message=msg1.wishMessageGenerator("Biswa");
		System.out.println(message);
		//call bussiness method
		String message2=msg2.wishMessageGenerator("Biswa");
		System.out.println(message);
	}
}
