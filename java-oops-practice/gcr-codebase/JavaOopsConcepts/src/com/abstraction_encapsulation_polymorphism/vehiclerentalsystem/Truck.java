package com.abstraction_encapsulation_polymorphism.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    private String insuranceNumber;
    private double insuranceRate;

    public Truck(int vehicleNumber, String type, double rentalRate,
                 String insuranceNumber, double insuranceRate) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceNumber = insuranceNumber;
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insuranceNumber;
    }
}
