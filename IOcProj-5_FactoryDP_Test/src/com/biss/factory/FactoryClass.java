package com.biss.factory;

import com.biss.bike.FZ_S;
import com.biss.bike.Gixxer;
import com.biss.bike.Hayabusa;
import com.biss.bike.Hayate;
import com.biss.bike.Suzuki;
import com.biss.tyre.CEAT;
import com.biss.tyre.JKTyre;
import com.biss.tyre.MRF;
import com.biss.tyre.Tyre;

public class FactoryClass {
	
	//Factory method
	public static Suzuki getInstance(String bikeType,String TyreType) {
		Suzuki bike=null;
		Tyre tyre=null;
		
		//Write logic for creating Tyre obj
		if(TyreType.equalsIgnoreCase("MRF"))
			tyre=new MRF();
		else if(TyreType.equalsIgnoreCase("ceat"))
			tyre=new CEAT();
		else if(TyreType.equalsIgnoreCase("jkTyre"))
			tyre=new JKTyre();
		else
			new IllegalArgumentException("invalid input");
		
		//Write logic for creating Suzuki obj
		if(bikeType.equalsIgnoreCase("Fz_s"))
			bike=new FZ_S(tyre);
		else if(bikeType.equalsIgnoreCase("gixxer"))
			bike=new Gixxer(tyre);
		else if(bikeType.equalsIgnoreCase("Hayabusa"))
			bike=new Hayabusa(tyre);
		else if(bikeType.equalsIgnoreCase("hayate"))
			bike=new Hayate(tyre);
		else
			new IllegalArgumentException("invalid input");
		
		return bike;
	}
}
