package com.skilldistillery.entities;

public class LuxuryJet extends Jet implements CargoCarrier{

	public LuxuryJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

public void loadCargo() {
	
}
}
