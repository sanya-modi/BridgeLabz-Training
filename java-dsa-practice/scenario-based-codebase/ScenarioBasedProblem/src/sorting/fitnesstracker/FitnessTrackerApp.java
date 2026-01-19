package sorting.fitnesstracker;

import java.util.Scanner;

public class FitnessTrackerApp {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	       System.out.println("Enter number of user");
	       int n = sc.nextInt();
	       sc.nextLine();
	    	
		   User[] userList = new User[n];
			
			for (int i = 0; i < n ; i++) {
				System.out.println("Enter User name : " );
				String name = sc.nextLine();
				System.out.println("Enter steps :");
				int steps = sc.nextInt();
				sc.nextLine();
				
				userList[i] = new User(name, steps);
			}
			
			SortUsers.bubbleSort(userList, n);
			
			System.out.println("Users are sorted by rank");
			SortUsers.display(userList);
		}

}
