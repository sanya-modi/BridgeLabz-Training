package com.functional_interface.multi_vehicle_rental_system;

public class Car implements RentalVehicle {

    @Override
    public void rent() {
        System.out.println("Car has been rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car has been returned");
    }
}
