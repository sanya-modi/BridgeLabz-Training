package com.object_modelling.UniversityManagement;

public class Department {

    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public void showDepartment() {
        System.out.println("Department: " + departmentName);
    }
}

