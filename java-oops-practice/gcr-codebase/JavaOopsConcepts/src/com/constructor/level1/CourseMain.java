package com.constructor.level1;

public class CourseMain {

	public static void main(String[] args) {
		
		Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Structures", 4, 30000);

        // Display before update
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstituteName("BridgeLabz");

        // Display after update
        c1.displayCourseDetails();
        c2.displayCourseDetails();

	}

}
