package com.object_modelling.CompanyAndDepartments;
import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void showDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.showEmployee();
        }
    }
}

