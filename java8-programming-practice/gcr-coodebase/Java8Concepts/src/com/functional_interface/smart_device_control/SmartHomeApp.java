package com.functional_interface.smart_device_control;

public class SmartHomeApp {
	 public static void main(String[] args) {

	        Device light = new Lights();
	        Device ac = new AC();
	        Device tv = new TV();

	        light.turnOn();
	        ac.turnOn();
	        tv.turnOn();

	        tv.turnOff();
	        ac.turnOff();
	        light.turnOff();
	    }
}
