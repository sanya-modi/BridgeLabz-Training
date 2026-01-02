package com.abstraction_encapsulation_polymorphism.vehiclerentalsystem;

public class Bike extends Vehicle {

    public Bike(int vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}
