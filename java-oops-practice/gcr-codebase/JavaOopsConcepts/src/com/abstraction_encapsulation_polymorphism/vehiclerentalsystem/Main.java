package com.abstraction_encapsulation_polymorphism.vehiclerentalsystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Car\n2. Bike\n3. Truck");
            System.out.print("Choose vehicle type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Vehicle Number: ");
            int vehicleNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Vehicle Type: ");
            String type = sc.nextLine();

            System.out.print("Rental Rate (per day): ");
            double rentalRate = sc.nextDouble();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Insurance Number: ");
                String insuranceNo = sc.nextLine();

                System.out.print("Insurance Rate: ");
                double insuranceRate = sc.nextDouble();
                sc.nextLine();

                vehicles.add(new Car(vehicleNumber, type, rentalRate,
                        insuranceNo, insuranceRate));
            }
            else if (choice == 2) {
                vehicles.add(new Bike(vehicleNumber, type, rentalRate));
            }
            else if (choice == 3) {
                System.out.print("Insurance Number: ");
                String insuranceNo = sc.nextLine();

                System.out.print("Insurance Rate: ");
                double insuranceRate = sc.nextDouble();
                sc.nextLine();

                vehicles.add(new Truck(vehicleNumber, type, rentalRate,
                        insuranceNo, insuranceRate));
            }
        }

        System.out.print("\nEnter rental days: ");
        int days = sc.nextInt();

        System.out.println("\n----- Rental Summary -----");

        for (Vehicle v : vehicles) {

            v.displayDetails();

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insuranceCost = ins.calculateInsurance();
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("--------------------------------");
        }

        sc.close();
    }
}
