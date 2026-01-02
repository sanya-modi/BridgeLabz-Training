package com.abstraction_encapsulation_polymorphism.rideapplication;

public class Auto extends Vehicle implements GPS {

    private String currentLocation;

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 20; // small base charge
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

