package com.abstraction_encapsulation_polymorphism.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    private String insuranceNumber;
    private double insuranceRate;

    public Car(int vehicleNumber, String type, double rentalRate,
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
        return "Car Insurance Policy: " + insuranceNumber;
    }
}
