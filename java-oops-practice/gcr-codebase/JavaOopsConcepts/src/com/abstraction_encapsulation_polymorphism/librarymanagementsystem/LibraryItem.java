package com.abstraction_encapsulation_polymorphism.librarymanagementsystem;

public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;
    private boolean available = true;

    // sensitive borrower data is kept private
    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return available;
    }

    protected void reserve(String borrowerName) {
        this.borrowerName = borrowerName;
        this.available = false;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }

    // each item has different loan duration
    public abstract int getLoanDuration();
}

