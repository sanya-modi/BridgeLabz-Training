package com.constructor.level1;

public class StudentPostGraduate extends Student{
	
	String specialization;

	// Constructor
    StudentPostGraduate(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Method demonstrating use of protected member
    void displayPostgraduateDetails() {
        System.out.println("Roll Number    : " + rollNumber); // public
        System.out.println("Name           : " + name);       // protected
        System.out.println("CGPA           : " + getCGPA());  // private via getter
        System.out.println("Specialization : " + specialization);
        System.out.println();
    }

}
