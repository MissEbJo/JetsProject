package com.skilldistillery.entities;

public class SkyTanic extends Jet implements CombatReady {
	int loadRounds;

	public SkyTanic(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public SkyTanic() {
	}

	public void fight(int loadRounds) {
		System.out.println("The SkyTanic has loaded " + loadRounds + " rounds of ammo.");
		System.out.println("Prepare yourself to take out all enemies foreign and domestic!");
		System.out.println("Do or Die, Semper Fi. \n");
		
	}
}
