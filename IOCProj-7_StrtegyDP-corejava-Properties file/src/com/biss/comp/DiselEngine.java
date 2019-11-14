package com.biss.comp;

public final class DiselEngine implements Engine {
	
	public DiselEngine() {
		System.out.println("DiselEngine::0-param constructort");
	}
	@Override
	public String start() {
		return "DiselEngine Started";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "DiselEngine Stopped";
	}

}
