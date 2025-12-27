package com.constructor.level1;

public class LibraryBookSystem {
	
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Constructor
   LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // book is available when added
        this.isAvailable = true;
    }

    // Method to borrow a book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title );
        } else {
            System.out.println("\nSorry, the book is already borrowed.\n");
        }
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : ₹" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println();
    }

}
