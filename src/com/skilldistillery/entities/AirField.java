package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jet> jetsList;
	String fileName = "jets.txt";

	public void Airfield() {

		AirField af = new AirField();
		jetsList = af.readJets(fileName);
		
		
		System.out.println(jetsList);
	}
	
	

	private List<Jet> readJets(String fileName) {
		List<Jet> insideJetsList = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetRecord = line.split(",");
				String type = jetRecord[0];
				String model = jetRecord[1]; // ask question: is this correct?
				double speed = Double.parseDouble(jetRecord[2]);
				int range = Integer.parseInt(jetRecord[3]);
				long price = Long.parseLong(jetRecord[4]);
				JetImpl insidesBroken = new JetImpl(model, speed, range, price);
				insideJetsList.add(insidesBroken);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		return jetsList;

	}
	
	public Jet determineJetType ( String[] jetsList) {
		Jet jetType = null;
		switch (jetsList[0]) {
		case "FighterJet":
			jetType = new FighterJet(jetsList[1], Double.parseDouble(jetsList[2]),
					Integer.parseInt(jetsList[3]), Long.parseLong(jetsList[4]));
			break;
		case "LuxuryJet":
			jetType = new FighterJet(jetsList[1], Double.parseDouble(jetsList[2]),
					Integer.parseInt(jetsList[3]), Long.parseLong(jetsList[4]));
			break;
		case "UfoBoom":
			jetType = new FighterJet(jetsList[1], Double.parseDouble(jetsList[2]),
					Integer.parseInt(jetsList[3]), Long.parseLong(jetsList[4]));
			break;
		case "CargoPlane":
			jetType = new FighterJet(jetsList[1], Double.parseDouble(jetsList[2]),
					Integer.parseInt(jetsList[3]), Long.parseLong(jetsList[4]));
			break;
		case "SkyTanic":
			jetType = new FighterJet(jetsList[1], Double.parseDouble(jetsList[2]),
					Integer.parseInt(jetsList[3]), Long.parseLong(jetsList[4]));
			break;

		default:
			System.out.println("Please enter a valid type of aircraft.");
			break;
		}
		
		
		return jetType;
		
	}
	
}
