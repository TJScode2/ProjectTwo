import java.util.ArrayList;
import java.util.Scanner;

public class Driver {  
	private static ArrayList<Dog> dogList = new ArrayList<Dog>(); // Add to this as needed.

	public static void main (String args []) {
		initializeDogList();
		displayMenu();
		takeInput();
	}

	/**
	Method used to add dummy values into dogList.  */
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

	/**
	Method used for printing the menu options that will be displayed to user */
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
	}

	/**
	Method used to take user input. */
	public static void takeInput() {
		String input = ""; // initialize input.
		// Use do while to check input validity after it is entered by user
		do {
			Scanner scan = new Scanner(System.in);
			input = scan.next();
			switch(input){
				case "1": intakeAnimal("Dog"); break;
				case "2": break;
				case "3": System.out.println("Do something"); break;
				case "4": break;
				case "5": System.out.println("Do something"); break;
				case "6": break;
			}
		} while(!input.equalsIgnoreCase("q")); // Exit
	}
}

