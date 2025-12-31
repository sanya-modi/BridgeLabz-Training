package com.object_modelling.LibraryManagementSystem;
import java.util.*;

public class Library {
	
	private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("\nLibrary: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
    }
    
}
