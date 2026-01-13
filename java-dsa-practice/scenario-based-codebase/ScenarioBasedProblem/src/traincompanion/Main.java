package traincompanion;

import java.util.*;

public class Main {
	
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Train train = new Train();

	        // Initial compartments
	        train.addCompartment("C1", "Sleeper");
	        train.addCompartment("C2", "WiFi");
	        train.addCompartment("C3", "Pantry");
	        train.addCompartment("C4", "AC");

	        while (true) {
	            System.out.println("\n===== TRAIN COMPANION MENU =====");
	            System.out.println("1. Move to Next Compartment");
	            System.out.println("2. Move to Previous Compartment");
	            System.out.println("3. Search Service");
	            System.out.println("4. Add Compartment");
	            System.out.println("5. Remove Compartment");
	            System.out.println("6. Show Current Compartment");
	            System.out.println("7. Exit");
	            System.out.print("Choose option: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:
	                    train.moveNext();
	                    break;

	                case 2:
	                    train.movePrevious();
	                    break;

	                case 3:
	                    System.out.print("Enter service to search: ");
	                    String service = sc.nextLine();
	                    train.searchService(service);
	                    break;

	                case 4:
	                    System.out.print("Enter compartment name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter service: ");
	                    String serv = sc.nextLine();
	                    train.addCompartment(name, serv);
	                    break;

	                case 5:
	                    System.out.print("Enter compartment name to remove: ");
	                    String removeName = sc.nextLine();
	                    train.removeCompartment(removeName);
	                    break;

	                case 6:
	                    train.displayCurrent();
	                    break;

	                case 7:
	                    System.out.println("Exiting Train Companion.");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	
}
