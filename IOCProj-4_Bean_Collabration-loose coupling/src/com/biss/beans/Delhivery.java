package com.biss.beans;

public class Delhivery implements Courior {
	public Delhivery() {
		System.out.println("Delhivery::0 param Constructor");
	}
	@Override
	public String deliver(long oid) {
		System.out.println("Delhivery.deliver()-called");
	return "product is deliver by Delhivery order id="+oid;
	}

}
