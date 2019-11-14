package com.biss.beans;

public class DTDC implements Courior {
	
	public DTDC() {
		System.out.println("DTDT::0 param constructor");
	}
	@Override
	public String deliver(long oid) {
		System.out.println("DTDC.deliver()-called");
	return "product is deliver by DTDC order id="+oid;
	}

}
