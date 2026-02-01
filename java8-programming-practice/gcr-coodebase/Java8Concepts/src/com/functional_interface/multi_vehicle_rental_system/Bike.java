package com.functional_interface.multi_vehicle_rental_system;

public class Bike implements RentalVehicle {

    @Override
    public void rent() {
        System.out.println("Bike has been rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike has been returned");
    }
}
