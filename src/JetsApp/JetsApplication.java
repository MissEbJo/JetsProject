package JetsApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.entities.AirField;
import com.skilldistillery.entities.CargoPlane;
import com.skilldistillery.entities.FighterJet;
import com.skilldistillery.entities.Jet;
import com.skilldistillery.entities.JetImpl;
import com.skilldistillery.entities.LuxuryJet;
import com.skilldistillery.entities.SkyTanic;
import com.skilldistillery.entities.UfoBoom;

public class JetsApplication {

	private AirField airField;
	private static Scanner input = new Scanner(System.in);
	private boolean keepGoing = true;

	public void JetApplication() {
//		airField.Airfield();
	}

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch();

	}

	private void launch() {
		airField = new AirField();
		airField.getField();
		displayUserMenu();
		selectOption();

	}

	private void displayUserMenu() {
		System.out.println("********** Welcome the 'Danger Zone'!**********");
		System.out.println();
		System.out.println("***********************************************");
		System.out.println("***********   1. List Fleet         ***********");
		System.out.println("**********    2. Fly All Jets        **********");
		System.out.println("*********     3. View Fastest Jet     *********");
		System.out.println("*****    4. View Jet With Longest Range   *****");
		System.out.println("********    5. Load All Cargo Jets     ********");
		System.out.println("**************   6. Dogfight!    **************");
		System.out.println("********     7. Add Jet To Fleet       ********");
		System.out.println("******      8. Remove Jet From Fleet    *******");
		System.out.println("**************     9. Quit       **************");
		System.out.println("***********************************************");
	}

	public void selectOption() {

		while (keepGoing) {
			System.out.println("Please enter the number of the option you would like to select: \n");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				displayFleet();
				break;
			case 2:
				flyJets();
				break;
			case 3:
				fastestJet();
				break;
			case 4:
				longestRangeJet();
				break;
			case 5:
				loadCargoJet();
				break;
			case 6:
				letsDogfight();
				break;
			case 7:
				addJet();
				break;
			case 8:
				removeJet();
				break;
			case 9:
				optionQuit();
				break;

			default:
				System.out.println("Please enter a valid number to select the screen to be viewed.");
				break;
			}
		}
	}

	private void displayFleet() {
		airField.displayAirfield();

	}

	public void flyJets() {
		airField.getField();
		
		double flightTime = 0;
		flightTime = 0;
		System.out.println(flightTime);		

	}

	private void fastestJet() {
		airField.getField();
		

	}

	private void longestRangeJet() {

	}

	private void loadCargoJet() {

	}

	private void letsDogfight() {

	}

	private void addJet() {
		airField.getField();
		List<Jet> jetsList = new ArrayList<>();
		System.out.println("To create a new jet, please add information in " + "accordance with the prompts.");
		System.out.print("What type of jet would you like: ");
		String type = input.next();

		System.out.println("Enter the model of the jet:");
		String model = input.next();

		System.out.println("Enter the speed (in MPH): ");
		double speed = input.nextDouble();
		input.nextLine();

		System.out.println("Enter the range(how far it can go before refueling): ");
		int range = input.nextInt();
		input.nextLine();

		System.out.println("Please enter the price: $");
		long price = input.nextLong();

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

		System.out.println(jetsList);
	}

	private void removeJet() {

	}

	private void optionQuit() {
		System.out.println("Thank you visiting our jets. Be cool!");
		keepGoing = false;

	}
}
