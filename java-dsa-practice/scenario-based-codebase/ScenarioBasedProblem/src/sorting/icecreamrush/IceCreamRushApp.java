package sorting.icecreamrush;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamRushApp {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		   IceCream[] iceCream= new IceCream[8];
			
			for (int i = 0; i < 8 ; i++) {
				System.out.println("Enter flavour name : " );
				String name = sc.nextLine();
				System.out.println("Enter rating :");
				double rating = sc.nextDouble();
				sc.nextLine();
				
				iceCream[i] = new IceCream(name, rating);
			}
			
			SortByPopularity.bubbleSort(iceCream, 8);
			
			System.out.println("Patients are sorted by criticality level");
			SortByPopularity.display(iceCream);
		}
	
}
