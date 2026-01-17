package sorting.robotwarehouse;

import java.util.Arrays;
import java.util.Scanner;

public class RobotWarehouseApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of packages");
		int n = sc.nextInt();
		
		Package[] shelf = new Package[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter weight of " + (i+1) + " package");
			 double weight = sc.nextDouble();
			 shelf[i] = new Package(weight);
		}
		
		System.out.println("Packags before sorting");
		PackageShelf.display(shelf);
		
		PackageShelf.insertionSort(shelf, n);
		
		System.out.println("Packags after sorting");
		PackageShelf.display(shelf);
	}

}
