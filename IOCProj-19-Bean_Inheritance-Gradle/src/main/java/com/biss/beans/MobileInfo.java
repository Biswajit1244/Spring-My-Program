package com.biss.beans;

public class MobileInfo {
	private String modleNo;
	private String compName;
	private String series;
	private float scrnSize;
	private float price;
	private  String ownerName;
	
	public void setModleNo(String modleNo) {
		this.modleNo = modleNo;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public void setScrnSize(float scrnSize) {
		this.scrnSize = scrnSize;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "MobileInfo [modleNo=" + modleNo + ", compName=" + compName + ", series=" + series + ", ScrnSize="
				+ scrnSize + ", price=" + price + ", ownerName=" + ownerName + "]";
	}
	
}
