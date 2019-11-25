package com.biss.beans;

public class TravleAgency {
	private String agencyName;
	private TravlePlaces tp;
	
	public TravleAgency(String agencyName, TravlePlaces tp) {
		System.out.println("TravleAgency::2-param constructor");
		this.agencyName = agencyName;
		this.tp = tp;
	}

	
	  public TravleAgency() {
	  System.out.println("TravleAgency::0-param constructor"); }
	 
	
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public TravlePlaces getTp() {
		return tp;
	}
	public void setTp(TravlePlaces tp) {
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TravleAgency [agencyName=" + agencyName + ", tp=" + tp + "]";
	}
	
}
