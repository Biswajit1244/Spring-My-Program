package com.biss.bike;

import com.biss.tyre.Tyre;

public class Hayate implements Suzuki {
	public Tyre tyre;
	
	public Hayate(Tyre tyre) {
		this.tyre=tyre;
	}
	@Override
	public String drive() {
		return "Driving 4-gear Hayate bike";
	}

	@Override
	public String specification() {
		return "Having Engine:113cc Milage:76kmpl Fuel tank:10L "+tyre.spec();
	}

}
