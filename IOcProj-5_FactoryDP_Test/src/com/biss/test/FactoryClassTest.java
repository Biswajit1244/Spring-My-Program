package com.biss.test;

import com.biss.bike.Suzuki;
import com.biss.factory.FactoryClass;

public class FactoryClassTest {

	public static void main(String[] args) {
		
		Suzuki sz=FactoryClass.getInstance("hayabusa", "jktyre");
		System.out.println(sz.drive());
		System.out.println(sz.specification());
		System.out.println();
		System.out.println("-------------------");
		Suzuki sz1=FactoryClass.getInstance("fz_s","mrf");
		System.out.println(sz1.drive());
		System.out.println(sz1.specification());
	}

}
