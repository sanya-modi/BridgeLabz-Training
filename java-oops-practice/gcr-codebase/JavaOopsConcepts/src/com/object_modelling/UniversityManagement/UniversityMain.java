package com.object_modelling.UniversityManagement;

public class UniversityMain {
	
	public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        University uni = new University("ABC University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversityDetails();

        // Deleting university deletes departments
        uni = null;

        // Faculty still exists independently
        f1.showFaculty();
        f2.showFaculty();
    }

}
