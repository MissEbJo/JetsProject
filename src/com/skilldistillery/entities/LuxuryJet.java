package com.skilldistillery.entities;

public class LuxuryJet extends Jet implements CargoCarrier{
	int loadCargo;
	
	

	public LuxuryJet() {
	}

	public LuxuryJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

public void loadCargo(int loadCargo) {
	System.out.println("The Luxury Jet has loaded " + loadCargo + " pieces of cargo. \n");
	
}
}
