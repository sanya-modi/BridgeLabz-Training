package com.functional_interface.smart_vehicle_dashboard;

public interface Vehicle {

    void displaySpeed();   // common to all vehicles

    // New feature added later
    default void displayBatteryPercentage() {
        System.out.println("Battery information not available for this vehicle");
    }
}
