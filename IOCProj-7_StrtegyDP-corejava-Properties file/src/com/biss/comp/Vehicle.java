package com.biss.comp;

public final class Vehicle {
	Engine engine;
	public Vehicle() {
		System.out.println("Vehiche::0-param constructor");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void journey(String start,String end) {
		System.out.println("-------------------");
		System.out.println(engine.start());
		System.out.println("Journey Started from "+start);
		System.out.println("lu lu lala lu lu(Journey going on)");
		System.out.println("Journey ended at "+end);
		System.out.println(engine.stop());
	}
}
