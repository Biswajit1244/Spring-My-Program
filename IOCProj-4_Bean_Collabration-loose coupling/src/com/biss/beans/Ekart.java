package com.biss.beans;

public class Ekart implements Courior{
	public Ekart() {
		System.out.println("Ekart::0-param constructor");
	}
	
	public String deliver(long oid) {
		System.out.println("Ekart.deliver()-called");
	return "product is deliver by Ekart order id="+oid;
	}

}
