package com.skilldistillery.entities;

public class UfoBoom extends Jet implements CargoCarrier {

	public UfoBoom(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public void loadCargo() {

	}
}
