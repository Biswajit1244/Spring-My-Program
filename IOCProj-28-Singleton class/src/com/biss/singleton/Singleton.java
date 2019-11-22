package com.biss.singleton;

public class Singleton {
	private static Singleton INSTANCE;
	private Singleton() {
		System.out.println("Singleton-Private Constructor");
	}
	public static Singleton getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Singleton();
		return INSTANCE;
	}
	
}
