package com.skilldistillery.entities;

public class FighterJet extends Jet implements CombatReady {
	int loadRounds;

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public FighterJet() {
	}

	public void fight(int loadRounds) {
		
		System.out.println("The Fighter Jet has loaded " + loadRounds + " rounds of ammo.");
		System.out.println("Prepare yourself to take out all enemies foreign and domestic!");
		System.out.println("Protect the ones you love & forsake all others. \n");
		
	}
}
