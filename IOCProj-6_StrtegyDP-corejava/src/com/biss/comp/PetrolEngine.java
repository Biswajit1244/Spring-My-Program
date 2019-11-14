package com.biss.comp;

public final class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine::0-param constructor");
	}
	@Override
	public String start() {
		return "PetrolEngne Started";
	}

	@Override
	public String stop() {
		return "PetrolEngine Stopped";
	}

}
