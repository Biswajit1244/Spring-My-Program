package com.biss.bike;

import com.biss.tyre.Tyre;

public class Gixxer implements Suzuki {
	public Tyre tyre;
	
	public Gixxer(Tyre tyre) {
		this.tyre=tyre;
	}
	@Override
	public String drive() {
		return "Driving 5-gear Gixxer bike";
	}

	@Override
	public String specification() {
		return "Having Engine:154.9cc Milage:64kmpl Fuel tank:12L "+tyre.spec();
	}

}
