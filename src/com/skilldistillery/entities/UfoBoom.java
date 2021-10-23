package com.skilldistillery.entities;

public class UfoBoom extends Jet implements CargoCarrier {

	public UfoBoom(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void loadCargo() {

	}
}
