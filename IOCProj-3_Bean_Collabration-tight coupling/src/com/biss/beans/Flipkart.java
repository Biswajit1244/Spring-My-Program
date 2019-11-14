package com.biss.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Flipkart {
	Ekart ekart;
	
	public Flipkart(Ekart ekart) {
		System.out.println("Flipkart::1-param constructor");
		this.ekart=ekart;
	}
	
	public String shopping(String[] items) {
		System.out.println("Flipkart.shopping()");
		
		Map<String, Double> prices=new HashMap<String,Double>(); 
		double price=0.0;
		double billAmt=0.0;
		long oid=0;
		ArrayList<Double> itemPrice=null;
		
		for(String item:items) {
			if(item.equalsIgnoreCase("tshirt")) {
				prices.put(item, price);
				}
			else if(item.equalsIgnoreCase("pant")) {
				prices.put(item, 1990.00);
			}
			else if(item.equalsIgnoreCase("trausor")) {
				prices.put(item, 1990.00);
			}
			else if(item.equalsIgnoreCase("mobile")) {
				prices.put(item,9999.00);
			}
			else if(item.equalsIgnoreCase("earphone")) {
				prices.put(item,799.00);
			}
			else if(item.equalsIgnoreCase("mithai")) {
				prices.put(item, 1599.00);
			}
		}
		itemPrice=new ArrayList<>();
		for(Map.Entry<String, Double> entry: prices.entrySet()) {
			billAmt=billAmt+entry.getValue();
			itemPrice.add(entry.getValue());
		}
		
		//Generate Order Id
		oid=new Random().nextInt(10000000);
		//Call Delivery method
		String msg=ekart.deliver(oid);
		
	
		return "items purchased "+Arrays.toString(items)+" and prices are "+itemPrice.toString()+
					"\nTotal bill amount="+billAmt+"\n"+msg;
	}
}
