package com.constructor.level1;

public class LibraryBookMain {

	public static void main(String[] args) {
		 LibraryBookSystem b1 = new LibraryBookSystem("Clean Code", "Robert C. Martin", 550);

	        b1.displayDetails();
	        // borrowing first time
	        b1.borrowBook(); 
	        // trying again
	        b1.borrowBook();   

	        b1.displayDetails();

	}

}
