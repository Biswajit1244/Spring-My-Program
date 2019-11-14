package com.biss.beans;

import java.util.Date;
import java.util.List;

public class PersonInfo_List {
	private List details;
	private List<Date> dates;
	
	public void setDetails(List details) {
		System.out.println(details.getClass());
		this.details = details;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "PersonInfo_List [details=" + details + ", dates=" + dates + "]";
	}
	
}
