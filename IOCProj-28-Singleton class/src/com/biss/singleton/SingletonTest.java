package com.biss.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1=null,s2=null;
		//create singleton class obj
		s1=Singleton.getInstance();
		s2=Singleton.getInstance();
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		System.out.println(s1==s2);
	}

}
