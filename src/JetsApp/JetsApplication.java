package JetsApp;

import java.util.Scanner;

import com.skilldistillery.entities.AirField;


public class JetsApplication {

	private AirField airField = new AirField();
	private Scanner input;
	
	public void JetApplication() {
		airField.Airfield();
	}
	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.launch();

	}

	private void launch () {

		
	}
	private void displayUserMenu() {
		System.out.println("***********************************************");
		System.out.println("***********   1. List Fleet         ***********");
		System.out.println("**********    2. Fly All Jets        **********");
		System.out.println("*********     3. View Fastest Jet     *********");
		System.out.println("*****    4. View Jet With Longest Range   *****");
		System.out.println("********    5. Load All Cargo Jets     ********");
		System.out.println("**************   6. Dogfight!    **************");
		System.out.println("********     7. Add Jet To Fleet       ********");
		System.out.println("******      8. Remove Jet From Fleet    *******");
		System.out.println("**************  9.   Quit        **************");
		System.out.println("***********************************************");
		
	}
	private void displayFleet() {
		
	}
	private void flyJets()	{
		
	}
	private void fastestJet() {
		
	}
	private void longestRangeJet() {
		
	}
	private void loadCargoJet() {
		
	}
	private void letsDogfight()	{
		
	}
	private void addJet() {
		
	}
	private void removeJet() {
		
	}
	private void optionQuit() {
		
	}
}
