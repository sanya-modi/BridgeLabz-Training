package sorting.flashdealz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlashDealzApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of products :");
		int n = sc.nextInt();
		sc.nextLine();
		
		Product[] productsList = new Product[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter name of product:");
			String name = sc.nextLine();
			System.out.println("Enter dicount:");
			double discount = sc.nextDouble();
			sc.nextLine();
			
			productsList[i] = new Product(name, discount) ;
		}
		
		SortProducts.quickSort(productsList, 0, n-1);
		
		SortProducts.display(productsList);
	}

}
