package com.abstraction_encapsulation_polymorphism.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            reserve(borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

