package com.skilldistillery.entities;

public class LuxuryJet extends Jet implements CargoCarrier{

	public LuxuryJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

public void loadCargo() {
	
}
}
