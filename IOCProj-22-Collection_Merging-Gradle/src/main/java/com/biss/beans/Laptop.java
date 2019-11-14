package com.biss.beans;

import java.util.List;

public class Laptop {
	private List<Object> spec;

	public void setSpec(List<Object> spec) {
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "Laptop [spec=" + spec + "]";
	}
	
	
}
