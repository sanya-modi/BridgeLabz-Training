package com.functional_interface.smart_vehicle_dashboard;

public class DashboardApp {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle electricCar = new ElectricCar();

        car.displaySpeed();
        car.displayBatteryPercentage();

        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage();
    }
}
