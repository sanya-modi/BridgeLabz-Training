package com.constructor.level1;

public class VehicleMain {

	public static void main(String[] args) {
		
		 Vehicle v1 = new Vehicle("Sanya", "Car");
	        Vehicle v2 = new Vehicle("Amit", "Bike");

	        // Display before update
	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();

	        // Update registration fee for all vehicles
	        Vehicle.updateRegistrationFee(6500);

	        // Display after update
	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();

	}

}
