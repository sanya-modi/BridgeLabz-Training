package com.functional_interface.multi_vehicle_rental_system;

import java.util.*;

public class RentalApp {

    public static void main(String[] args) {

        List<RentalVehicle> vehicles = Arrays.asList(
                new Car(),
                new Bike(),
                new Bus()
        );

        for (RentalVehicle v : vehicles) {
            v.rent();
            v.returnVehicle();
        }
    }
}
