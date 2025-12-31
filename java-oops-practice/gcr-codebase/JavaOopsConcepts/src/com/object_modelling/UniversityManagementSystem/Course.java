package com.object_modelling.UniversityManagementSystem;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(
            professor.getName() + " assigned to " + courseName
        );
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(
            student.getName() + " enrolled in " + courseName
        );
    }
}

