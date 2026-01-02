package com.abstraction_encapsulation_polymorphism.hospitalpatientmanagement;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. In-Patient\n2. Out-Patient");
            System.out.print("Choose patient type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            Patient patient;

            if (choice == 1) {
                System.out.print("Days Admitted: ");
                int days = sc.nextInt();

                System.out.print("Daily Charge: ");
                double charge = sc.nextDouble();
                sc.nextLine();

                patient = new InPatient(id, name, age, days, charge);
            } else {
                System.out.print("Consultation Fee: ");
                double fee = sc.nextDouble();
                sc.nextLine();

                patient = new OutPatient(id, name, age, fee);
            }

            System.out.print("Add medical record: ");
            String record = sc.nextLine();
            ((MedicalRecord) patient).addRecord(record);

            patients.add(patient);
        }

        System.out.println("\n----- Patient Billing Details -----");

        for (Patient p : patients) {

            p.getPatientDetails();

            System.out.println("Bill Amount: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }

            System.out.println("--------------------------------");
        }

        sc.close();
    }
}

