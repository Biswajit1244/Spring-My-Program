package com.biss.beans;

import java.util.Arrays;
import java.util.Date;

public class ExamMark_Array {
	private int Marks[];
	private Date date[];
	
	public void setMarks(int[] marks) {
		Marks = marks;
	}
	public void setDate(Date[] date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ExamMark_Array [Marks=" + Arrays.toString(Marks) + ", date=" + Arrays.toString(date) + "]";
	}
	
	
	
}
