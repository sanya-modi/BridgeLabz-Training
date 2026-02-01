package com.functional_interface.multi_vehicle_rental_system;

public class Bus implements RentalVehicle {

    @Override
    public void rent() {
        System.out.println("Bus has been rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned");
    }
}
