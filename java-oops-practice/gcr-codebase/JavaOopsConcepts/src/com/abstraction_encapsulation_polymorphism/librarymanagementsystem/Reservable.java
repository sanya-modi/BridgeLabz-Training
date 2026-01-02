package com.abstraction_encapsulation_polymorphism.librarymanagementsystem;

public interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();
}
