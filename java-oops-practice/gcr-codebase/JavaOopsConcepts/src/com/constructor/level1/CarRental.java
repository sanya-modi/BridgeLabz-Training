package com.constructor.level1;

public class CarRental {
	String customerName;
    String carModel;
    int rentalDays;

    //fixed daily rate
    static final double DAILY_RATE = 1500; 

    //Default constructor
    CarRental() {
        this.customerName = "Customer";
        this.carModel = "Hatchback";
        this.rentalDays = 1;
    }

    //Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Method to display rental details
    void displayRental() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
        System.out.println();
    }
}
