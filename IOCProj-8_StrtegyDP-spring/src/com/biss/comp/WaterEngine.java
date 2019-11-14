package com.biss.comp;

public final class WaterEngine implements Engine {
	
	public WaterEngine() {
		System.out.println("WaterEngine::0-param constructort");
	}
	@Override
	public String start() {
		return "WaterEngine Started";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "WaterEngine Stopped";
	}

}
