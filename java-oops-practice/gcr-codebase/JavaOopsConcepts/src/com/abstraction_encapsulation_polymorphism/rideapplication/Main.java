package com.abstraction_encapsulation_polymorphism.rideapplication;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Car\n2. Bike\n3. Auto");
            System.out.print("Choose vehicle type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Vehicle ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Driver Name: ");
            String driver = sc.nextLine();

            System.out.print("Rate per Km: ");
            double rate = sc.nextDouble();
            sc.nextLine();

            Vehicle v;

            if (choice == 1) {
                v = new Car(id, driver, rate);
            } else if (choice == 2) {
                v = new Bike(id, driver, rate);
            } else {
                v = new Auto(id, driver, rate);
            }

            System.out.print("Current Location: ");
            String location = sc.nextLine();
            ((GPS) v).updateLocation(location);

            vehicles.add(v);
        }

        System.out.print("\nEnter distance (km): ");
        double distance = sc.nextDouble();

        System.out.println("\n----- Fare Details -----");

        for (Vehicle v : vehicles) {

            v.getVehicleDetails();

            double fare = v.calculateFare(distance);
            System.out.println("Current Location: " +
                    ((GPS) v).getCurrentLocation());
            System.out.println("Total Fare: " + fare);

            System.out.println("--------------------------------");
        }

        sc.close();
    }
}

