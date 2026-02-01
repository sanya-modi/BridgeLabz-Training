package com.functional_interface.smart_device_control;

public class Lights implements Device {

    @Override
    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned OFF");
    }

}
