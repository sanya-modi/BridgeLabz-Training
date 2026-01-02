package com.abstraction_encapsulation_polymorphism.hospitalpatientmanagement;

import java.util.*;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // sensitive data kept private
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    protected void viewMedicalHistory() {
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // billing differs per patient type
    public abstract double calculateBill();
}
