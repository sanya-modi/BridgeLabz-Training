package com.constructor.level1;

public class Manager extends Employee {

	String role;

    // Parameterized Constructor
    Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    // Method to display employee details
    void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);     
        System.out.println("Department  : " + department);      
        System.out.println("Salary      : ₹" + getSalary());    
        System.out.println("Role        : " + role);
        System.out.println();
    }
	
}
