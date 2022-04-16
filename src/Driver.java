import java.util.ArrayList;
import java.util.Scanner;

public class Driver {  
	private static ArrayList<Dog> dogList = new ArrayList<Dog>(); // Add to this as needed.
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); // Monkey List
	public static void main (String args []) {
		initializeDogList();
		initializeMonkeyList();
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
    public static void initializeMonkeyList( ) {
    	Monkey monkey1 = new Monkey("Did", true, "Monkey", "Male,", "3", "43", "03-19-2020", "Tokyo", "None", true, "Tokyo");
    	Monkey monkey2 = new Monkey("Guy", true, "Monkey", "Female,", "1", "21", "06-20-2021", "Cape Town", "None", false, "United States of America");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
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
    
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.next();
        System.out.println("What is this animal's type?");
        String type = scanner.next();
        System.out.println("What is this animal's gender?");
        String gender = scanner.next();
        System.out.println("What is this animal's age?");
        String age = scanner.next();
        System.out.println("What is this animal's weight?");
        String weight = scanner.next();
        System.out.println("When did you acquire this animal?");
        String acquire = scanner.next();
        System.out.println("Where did you acquire this animal?");
        String country = scanner.next();
        System.out.println("Is this animal trained?");
        String train = scanner.next();
        System.out.println("What country is this animal in service?");
        String service = scanner.next();
		System.out.println("Is this animal reserved? (true/false)");
        boolean reserved = scanner.nextBoolean();
        
		for(int i = 0; i < dogList.size(); i++) {
            if(dogList.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                displayMenu();
				return; // returns to menu
            } else {
            	Dog dog4 = new Dog(name, type, gender, age, weight, acquire, country, train, reserved, service); 
                dogList.add(dog4);
				return;	
            }
        }
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
				case "1": intakeNewDog(scan); break;
				case "2": break;
				case "3": System.out.println("Do something"); break;
				case "4": break;
				case "5": System.out.println("Do something"); break;
				case "6": break;
			}
		} while(!input.equalsIgnoreCase("q")); // Exit
	}
}

