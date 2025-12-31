package com.object_modelling.CompanyAndDepartments;
import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showDepartment();
        }
    }
}

