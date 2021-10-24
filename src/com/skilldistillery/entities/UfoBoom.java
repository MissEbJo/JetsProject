package com.skilldistillery.entities;

public class UfoBoom extends Jet implements CargoCarrier {
	int loadCargo;

	public UfoBoom(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public UfoBoom() {
	}

	public void loadCargo(int loadCargo) {
		System.out.println("The Ufo Boom has loaded " + loadCargo + " pieces of cargo. \n");

	}
}
