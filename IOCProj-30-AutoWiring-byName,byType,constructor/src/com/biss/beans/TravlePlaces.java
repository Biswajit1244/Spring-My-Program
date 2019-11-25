package com.biss.beans;

import java.util.Arrays;

public class TravlePlaces {
	public String place[];
	
	public TravlePlaces() {
		System.out.println("TravlePlaces::0-param constructor");
	}
	
	public String[] getPlace() {
		return place;
	}

	public void setPlace(String[] place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "TravlePlaces [place=" + Arrays.toString(place) + "]";
	}

}
