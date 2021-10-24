package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	protected List<Jet> jetsList;
	protected String fileName = "jets.txt";


	public void Airfield() {

	}

	public void getField() {
		readJets();
	}

	private void readJets() {
		jetsList = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetRecord = line.split(",");
				String type = jetRecord[0];
				String model = jetRecord[1]; // ask question: is this correct?
				double speed = Double.parseDouble(jetRecord[2]);
				int range = Integer.parseInt(jetRecord[3]);
				long price = Long.parseLong(jetRecord[4]);

				if (type.equals("FighterJet")) {
					Jet newJet = new FighterJet(type, model, speed, range, price);
					jetsList.add(newJet);
				} else if (type.equals("CargoPlane")) {
					Jet newJet = new CargoPlane(type, model, speed, range, price);
					jetsList.add(newJet);
				} else if (type.equals("LuxuryJet")) {
					Jet newJet = new LuxuryJet(type, model, speed, range, price);
					jetsList.add(newJet);
				} else if (type.equals("UfoBoom")) {
					Jet newJet = new UfoBoom(type, model, speed, range, price);
					jetsList.add(newJet);
				} else if (type.equals("SkyTanic")) {
					Jet newJet = new SkyTanic(type, model, speed, range, price);
					jetsList.add(newJet);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public void displayAirfield() {
//		System.out.println("DISPLAY AIRFIELD");
		for ( Jet jet : jetsList) {
			if (jetsList != null) {
				System.out.println(jet);
			}
		}
	}

}
