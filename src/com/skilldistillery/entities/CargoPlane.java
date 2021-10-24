package com.skilldistillery.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	int loadcargo;
	
	public CargoPlane(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public CargoPlane() {
	}

	public void loadCargo(int loadCargo) {
		System.out.println("The Cargo plane has loaded " + loadCargo + " pieces of cargo. \n");
	}
	
}
