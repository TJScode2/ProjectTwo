import java.util.Scanner;

public class Driver {  
	
	// This method prints the menu options
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

	public static void main (String args []) {
		//
		 
			
		displayMenu();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.print(input);
		
	
			
		
	}
}

