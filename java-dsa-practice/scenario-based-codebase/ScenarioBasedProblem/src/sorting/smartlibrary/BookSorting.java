package sorting.smartlibrary;

import sorting.artexpo.Artist;

public class BookSorting {
	
	public static void insertionSort(Book[] bookList, int n ) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(bookList[j].name.compareTo(bookList[j+1].name) > 0) {
					Book temp = bookList[j];
					bookList[j] = bookList[j+1];
					bookList[j+1] = temp; 
				}
			}
		}
	}
	
	public static void display(Book[] bookList) {
		for(Book b : bookList) {
			System.out.println( b.name + " ");
		}
	}

}
