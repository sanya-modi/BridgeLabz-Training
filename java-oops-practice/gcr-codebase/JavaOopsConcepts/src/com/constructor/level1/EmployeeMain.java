package com.constructor.level1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Manager m = new Manager(501,"Engineering",85000,"Team Lead");

        m.displayManagerDetails();

        // Modifying salary using public method
        m.updateSalary(95000);
        System.out.println("Updated Salary: ₹" + m.getSalary());

	}

}
