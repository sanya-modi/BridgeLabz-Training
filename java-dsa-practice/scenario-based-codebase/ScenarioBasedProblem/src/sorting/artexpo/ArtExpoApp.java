package sorting.artexpo;

import java.util.Arrays;
import java.util.Scanner;

public class ArtExpoApp {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    
			System.out.println("Enter number of artist");
			int n = sc.nextInt();
			sc.nextLine();
			Artist artist[] = new Artist[n];
			
			for (int i = 0; i < n ; i++) {
				System.out.println("Enter artist name : ");
				String name = sc.nextLine();
				System.out.println("Enter the registration timing in HH:MM:SS: ");
				String time = sc.nextLine();
				
				artist[i] = new Artist(name, time);
			}
			
			ArtistSorting.insertionSort(artist, n);
			
			System.out.println("Artist are sorted by registration time");
			ArtistSorting.display(artist);
		
	}

}
