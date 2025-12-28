package com.constructor.level1;

public class CarRentalMain {
	
	public static void main(String[] args) {

        // Default rental
        CarRental r1 = new CarRental();
        r1.displayRental();

        // User-defined rental
        CarRental r2 = new CarRental("Sanya", "Sedan", 4);
        r2.displayRental();
    }

}
