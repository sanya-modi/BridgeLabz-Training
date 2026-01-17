package sorting.smartlibrary;

import java.util.Scanner;

public class SmartLibraryApp {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    
			System.out.println("Enter number of book");
			int n = sc.nextInt();
			sc.nextLine();
			Book[] bookList = new Book[n];
			
			for (int i = 0; i < n ; i++) {
				System.out.println("Enter book name : ");
				String name = sc.nextLine();
				
				bookList[i] = new Book(name);
			}
			
			BookSorting.insertionSort(bookList, n);
			
			System.out.println("Book are sorted by name");
			BookSorting.display(bookList);
		
	}

}
