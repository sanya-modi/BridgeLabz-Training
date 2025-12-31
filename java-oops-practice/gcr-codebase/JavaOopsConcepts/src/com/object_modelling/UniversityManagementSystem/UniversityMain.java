package com.object_modelling.UniversityManagementSystem;

public class UniversityMain {
	
	 public static void main(String[] args) {

	        Student s1 = new Student("Sanya");
	        Student s2 = new Student("Rahul");

	        Professor p1 = new Professor("Dr. Sharma");

	        Course java = new Course("Java Programming");

	        java.assignProfessor(p1);

	        s1.enrollCourse(java);
	        s2.enrollCourse(java);
	    }

}
