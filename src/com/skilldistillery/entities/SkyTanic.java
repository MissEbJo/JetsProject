package com.skilldistillery.entities;

public class SkyTanic extends Jet implements CombatReady {

	public SkyTanic(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public void fight() {
		
	}
}
