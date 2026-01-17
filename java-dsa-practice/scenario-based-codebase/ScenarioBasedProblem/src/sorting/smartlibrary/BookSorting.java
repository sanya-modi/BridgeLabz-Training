package sorting.smartlibrary;

import sorting.artexpo.Artist;

public class BookSorting {
	
	public static void insertionSort(Book[] bookList, int n ) {
		for(int i=1; i<n; i++) {
			Book key = bookList[i];
			int j = i-1;
			
			while(j>=0 && bookList[j].name.compareToIgnoreCase(key.name) > 0) {
				bookList[j+1] = bookList[j];
				j--;
			}
			
			bookList[j+1] = key;
	}
	}
	
	public static void display(Book[] bookList) {
		for(Book b : bookList) {
			System.out.println( b.name + " ");
		}
	}

}
