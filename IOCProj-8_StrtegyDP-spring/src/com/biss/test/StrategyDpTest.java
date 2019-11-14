package com.biss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.biss.comp.Vehicle;

@SuppressWarnings("deprecation")
public class StrategyDpTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BeanFactory factory=null;
		Vehicle vehicle=null;

		//Crete container 
		factory=new XmlBeanFactory(new ClassPathResource("com/biss/cfgs/applicationContext.xml"));
		//get the spring bean class obj
		vehicle=factory.getBean("enggn",Vehicle.class);
		
		//Call business method
		vehicle.journey("Bhadrak","Goa");
	}
}
