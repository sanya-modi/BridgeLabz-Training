package com.object_modelling.LibraryManagementSystem;

public class LibraryManagement {

	public static void main(String[] args) {
		
		// Creating Book objects (independent)
        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

        // Creating Library objects
        Library centralLibrary = new Library("Central Library");
        Library collegeLibrary = new Library("College Library");

        // Adding books to libraries
        centralLibrary.addBook(b1);
        centralLibrary.addBook(b2);

        // Same book in another library
        collegeLibrary.addBook(b2); 
        collegeLibrary.addBook(b3);

        // Display books
        centralLibrary.showBooks();
        collegeLibrary.showBooks();

	}

}
