package com.biss.beans;

public class MobileInfo {
	private String modleNo;
	private String compName;
	private String series;
	private float scrnSize;
	private float price;
	private  String ownerName;
	
	
	public MobileInfo(String modleNo, String compName, String series, float scrnSize, float price, String ownerName) {
		this.modleNo = modleNo;
		this.compName = compName;
		this.series = series;
		this.scrnSize = scrnSize;
		this.price = price;
		this.ownerName = ownerName;
	}


	@Override
	public String toString() {
		return "MobileInfo [modleNo=" + modleNo + ", compName=" + compName + ", series=" + series + ", ScrnSize="
				+ scrnSize + ", price=" + price + ", ownerName=" + ownerName + "]";
	}
	
}
