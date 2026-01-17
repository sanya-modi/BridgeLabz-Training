package sorting.smartshelf;

import java.util.Scanner;

public class Books {
	
	public static void insertionSort(String[] books) {
		int n = books.length;
		
		for(int i=1; i<n; i++) {
			String key = books[i];
			int j = i-1;
			
			while(j>=0 && books[j].compareTo(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
		}
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    
			System.out.println("Enter number of patients");
			int n = sc.nextInt();
			sc.nextLine();
			String books[] = new String[n];
			
			for (int i = 0; i < n ; i++) {
				System.out.println("Enter the name of  " + (i+1) + "book: ");
				books[i] = sc.nextLine();
			}	
		
	        insertionSort(books);

	        for (String s : books) {
	            System.out.print(s + " ");
	        }
		
	}
	
}
