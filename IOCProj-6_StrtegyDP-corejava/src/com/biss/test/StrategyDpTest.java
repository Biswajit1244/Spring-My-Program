package com.biss.test;

import com.biss.comp.Vehicle;
import com.biss.factory.VehicleFactory;

public class StrategyDpTest {
	public static void main(String[] args) {
		Vehicle vehicle=null;
		
		vehicle=VehicleFactory.getInstance("water");
		
		vehicle.journey("Bhadrak","puri");
	}
}
