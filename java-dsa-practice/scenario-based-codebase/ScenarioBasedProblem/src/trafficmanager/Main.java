package trafficmanager;

import java.util.*;

public class Main {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Roundabout roundabout = new Roundabout();

	        while (true) {
	            System.out.println("\n===== TRAFFIC MANAGER MENU =====");
	            System.out.println("1. Add Vehicle to Waiting Queue");
	            System.out.println("2. Enter Vehicle into Roundabout");
	            System.out.println("3. Exit Vehicle from Roundabout");
	            System.out.println("4. Display Roundabout");
	            System.out.println("5. Exit");
	            System.out.print("Choose option: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter vehicle number: ");
	                    String vNum = sc.nextLine();
	                    roundabout.addToQueue(vNum);
	                    break;

	                case 2:
	                    roundabout.enterRoundabout();
	                    break;

	                case 3:
	                    roundabout.exitRoundabout();
	                    break;

	                case 4:
	                    roundabout.displayRoundabout();
	                    break;

	                case 5:
	                    System.out.println("Traffic Manager Closed.");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
	
}
