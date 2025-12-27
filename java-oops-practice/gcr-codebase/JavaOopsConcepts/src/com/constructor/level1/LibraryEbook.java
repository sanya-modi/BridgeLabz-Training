package com.constructor.level1;

public class LibraryEbook extends LibraryBookType{
	
	 double fileSize; // in MB

	    // Constructor
	 LibraryEbook(String ISBN, String title, String author, double fileSize) {
	        super(ISBN, title, author);
	        this.fileSize = fileSize;
	    }

	    // Method demonstrating access modifiers
	    void displayEBookDetails() {
	        System.out.println("ISBN      : " + ISBN);        
	        System.out.println("Title     : " + title);       
	        System.out.println("Author    : " + getAuthor()); 
	        System.out.println("File Size : " + fileSize + " MB");
	        System.out.println();
	    }

}
