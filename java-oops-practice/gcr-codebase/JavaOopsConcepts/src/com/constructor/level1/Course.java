package com.constructor.level1;

public class Course {
	
	 // Instance variables
    String courseName;
    int duration;      
    double fee;

    // Class variable 
    static String instituteName = "Tech Academy";

    // Parameterized Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : ₹" + fee);
        System.out.println();
    }

    // Class method (static method)
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

}
