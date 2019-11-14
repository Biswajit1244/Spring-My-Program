package com.biss.beans;

import java.util.Date;
import java.util.Set;

public class Student_Set {
	private Set<Long> mobNo;
	private Set<Date> dates;
	
	public void setMobNo(Set<Long> mobNo) {
		System.out.println(mobNo.getClass());
		this.mobNo = mobNo;
	}
	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "Student_Set [mobNo=" + mobNo + ", dates=" + dates + "]";
	}
	
}
