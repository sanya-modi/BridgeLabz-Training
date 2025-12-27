package com.constructor.level1;

public class Vehicle {
	
	// Instance variables 
    String ownerName;
    String vehicleType;

    // Class variable 
    static double registrationFee = 5000; // ₹

    // Parameterized Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : ₹" + registrationFee);
        System.out.println();
    }

    // Class method 
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

}
