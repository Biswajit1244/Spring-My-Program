package com.biss.factory;

import com.biss.comp.DiselEngine;
import com.biss.comp.Engine;
import com.biss.comp.PetrolEngine;
import com.biss.comp.Vehicle;
import com.biss.comp.WaterEngine;

public class VehicleFactory {
	
	public static Vehicle getInstance(String engineType) {
		Engine engine=null;
		if(engineType.equalsIgnoreCase("disel")){
			engine=new DiselEngine();
		}
		else if(engineType.equalsIgnoreCase("petrol")) {
			engine=new PetrolEngine();
		}
		else if(engineType.equalsIgnoreCase("water")) {
			engine=new WaterEngine();
		}
		Vehicle vh=new Vehicle();
		vh.setEngine(engine);
	return vh;
	}
}