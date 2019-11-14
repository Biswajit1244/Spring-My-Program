package com.biss.beans;

public class BlueDart implements Courior {
	public BlueDart() {
		// TODO Auto-generated constructor stub
		System.out.println("BlueDart::0 param constructor");
	}
	@Override
	public String deliver(long oid) {
		System.out.println("BlueDart.deliver()-called");
	return "product is deliver by BlueDart order id="+oid;
	}
}
