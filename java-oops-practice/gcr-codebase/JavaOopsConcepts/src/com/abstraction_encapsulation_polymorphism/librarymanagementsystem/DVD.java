package com.abstraction_encapsulation_polymorphism.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // days
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

