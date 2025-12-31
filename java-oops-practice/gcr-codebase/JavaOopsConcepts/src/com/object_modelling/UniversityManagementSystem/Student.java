package com.object_modelling.UniversityManagementSystem;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }
}

