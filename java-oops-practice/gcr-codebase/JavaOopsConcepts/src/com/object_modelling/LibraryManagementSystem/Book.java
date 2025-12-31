package com.object_modelling.LibraryManagementSystem;

public class Book {
	
	    private String title;
	    private String author;

	    //Parameterized Constructor
	    Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    //Getter for title
	    public String getTitle() {
	        return title;
	    }

	    //Getter for author
	    public String getAuthor() {
	        return author;
	    }
	    
	    public void displayBook() {
	        System.out.println("Book Title: " + title + ", Author: " + author);
	    }
}
