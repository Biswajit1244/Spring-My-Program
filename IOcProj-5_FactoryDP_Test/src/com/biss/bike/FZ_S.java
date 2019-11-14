package com.biss.bike;

import com.biss.tyre.Tyre;

public class FZ_S implements Suzuki {
	
	public Tyre tyre;
	//1 param constructor
	public FZ_S(Tyre tyre) {
		this.tyre=tyre;
	}
	@Override
	public String drive() {
		return "Driving 5-gear system FZ-s bike";
	}

	@Override
	public String specification() {
		// TODO Auto-generated method stub
		return "Having Engine:153cc Milage:48kmpl Fuel tank:12L "+tyre.spec();
	}

}
