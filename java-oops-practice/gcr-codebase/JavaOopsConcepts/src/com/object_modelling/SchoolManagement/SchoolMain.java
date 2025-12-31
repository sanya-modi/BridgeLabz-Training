package com.object_modelling.SchoolManagement;

public class SchoolMain {

    public static void main(String[] args) {

        School school = new School("ABC School");

        Student s1 = new Student("Sanya");
        Student s2 = new Student("Rahul");

        Course java = new Course("Java");
        Course dbms = new Course("DBMS");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(java);
        s1.enrollCourse(dbms);
        s2.enrollCourse(java);

        s1.viewCourses();
        java.showEnrolledStudents();
    }
}

