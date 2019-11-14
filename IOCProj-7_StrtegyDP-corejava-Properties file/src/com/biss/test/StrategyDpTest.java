package com.biss.test;

import com.biss.comp.Vehicle;
import com.biss.factory.VehicleFactory;

public class StrategyDpTest {
	public static void main(String[] args) {
		Vehicle vehicle=null;
		try {
			vehicle=VehicleFactory.getInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vehicle.journey("Bhadrak","puri");
	}
}
