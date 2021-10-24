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
	private List<Jet> initList;
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
		initList = airField.getList();
//		displayUserMenu();
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
			displayUserMenu();
			System.out.print("Please enter the number of the option you would like to select: \n");

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
		airField.flyAllJets();

	}

	private void fastestJet() {
		List<Jet> initList = airField.getList();

		double topSpeed = 0.0;
		int atIndex = 0;

		for (int index = 0; index < initList.size(); index++) {
			if (initList.get(index).getSpeed() > topSpeed) {
				atIndex = index;
				topSpeed = initList.get(index).getSpeed();
			}
		}
		System.out.println("Fastest jet in the fleet: " + initList.get(atIndex) + "with a speed of: " + topSpeed + "!");
		System.out.println();

	}

	private void longestRangeJet() {
		List<Jet> initList = airField.getList();

		double longRange = 0.0;
		int atIndex = 0;

		for (int index = 0; index < initList.size(); index++) {
			if (initList.get(index).getRange() > longRange) {
				atIndex = index;
				longRange = initList.get(index).getRange();
			}
		}
		System.out.println("The jet with the longest range in the fleet: " + initList.get(atIndex) + "with a range of: "
				+ longRange + "!");
		System.out.println();
	}

	private void loadCargoJet() {

		Jet c = new CargoPlane();
		Jet u = new UfoBoom();
		Jet lJ = new LuxuryJet();

		System.out.print("Please enter the amount of cargo you would like loaded: ");
		int total = input.nextInt();
		((CargoPlane) c).loadCargo(total);
		((UfoBoom) u).loadCargo(total);
		((LuxuryJet) lJ).loadCargo(total);
		System.out.println();

	}

	private void letsDogfight() {
		Jet f = new FighterJet();
		Jet s = new SkyTanic();

		System.out.print("Please enter the amount of ammo that needs to be loaded: ");
		int total = input.nextInt();
		((FighterJet) f).fight(total);
		((SkyTanic) s).fight(total);
		System.out.println();

	}

	private void addJet() {
		airField.getField();
		List<Jet> jetsList = new ArrayList<>();
		System.out.println("To create a new jet, please add information in " + "accordance with the prompts.");
		System.out.print("What type of jet would you like: ");
		String type = input.next();

		System.out.print("Enter the model of the jet:");
		String model = input.next();

		System.out.print("Enter the speed (in MPH): ");
		double speed = input.nextDouble();
		input.nextLine();

		System.out.print("Enter the range(how far it can go before refueling): ");
		int range = input.nextInt();
		input.nextLine();

		System.out.print("Please enter the price: $");
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
		airField.getList().addAll(jetsList);
		System.out.println(jetsList);
	}

	private void removeJet() {

		System.out.println(airField.getList());
		System.out.print("Which aircraft would you like to remove(count starts at 0): ");
		int count = input.nextInt();
		airField.getList().remove(count);
	}

	private void optionQuit() {
		System.out.println("Thank you visiting our jets. Be cool!");
		keepGoing = false;

	}
}
