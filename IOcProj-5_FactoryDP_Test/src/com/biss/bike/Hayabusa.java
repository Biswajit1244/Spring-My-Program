package com.biss.bike;

import com.biss.tyre.Tyre;

public class Hayabusa implements Suzuki {
    public Tyre tyre;
	
	public Hayabusa(Tyre tyre) {
		this.tyre=tyre;
	}
	@Override
	public String drive() {
		return "Driving 6-gear Hayabusa bike";
	}

	@Override
	public String specification() {
		return "Having Engine:1340cc Milage:11kmpl Fuel tank:21L "+tyre.spec();
	}

}
