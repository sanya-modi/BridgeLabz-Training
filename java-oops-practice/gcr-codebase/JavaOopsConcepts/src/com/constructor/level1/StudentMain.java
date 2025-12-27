package com.constructor.level1;

public class StudentMain {

	public static void main(String[] args) {
		
		//Creating new object
		 StudentPostGraduate pg = new StudentPostGraduate(
	                101, "Sanya", 8.6, "Computer Science"
	        );

	        pg.displayPostgraduateDetails();

	        // Modifying CGPA using public method
	        pg.setCGPA(9.1);
	        System.out.println("Updated CGPA   : " + pg.getCGPA());

	}

}
