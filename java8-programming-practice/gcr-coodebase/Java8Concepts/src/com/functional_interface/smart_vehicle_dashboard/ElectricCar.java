package com.functional_interface.smart_vehicle_dashboard;

public class ElectricCar implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Electric car speed: 90 km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery level: 75%");
    }
}
