package com.nt.beans;

import java.util.Date;

public class WishMessage {
	Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	//Write wish Message generator logic
	public String wishMessageGenerator(String user) {
		int hour=0;
		System.out.println(date);
		//get current hour 
		hour=date.getHours();
		System.out.println(hour);
		
		if(hour<=12) {
			return "Good Morning "+user;
		}
		else if(hour<=16) {
			return "Good Afternoon "+user;
		}
		else if(hour<22) {
			return "Good Evening "+user;
			
		}
		else {
			return "Good night "+user;
		}
			
	}

}
