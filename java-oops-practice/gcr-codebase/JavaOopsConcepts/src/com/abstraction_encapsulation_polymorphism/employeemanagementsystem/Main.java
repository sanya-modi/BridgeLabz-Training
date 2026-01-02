package com.abstraction_encapsulation_polymorphism.employeemanagementsystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Full Time Employee\n2. Part Time Employee");
            System.out.print("Choose type: ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            if (type == 1) {

                System.out.print("Fixed Salary: ");
                double salary = sc.nextDouble();

                FullTimeEmployee emp = new FullTimeEmployee(id, name, salary);
                emp.assignDepartment(dept);
                employees.add(emp);

            } else if (type == 2) {

                System.out.print("Hourly Rate: ");
                double rate = sc.nextDouble();

                System.out.print("Hours Worked: ");
                int hours = sc.nextInt();

                PartTimeEmployee emp = new PartTimeEmployee(id, name, rate, hours);
                emp.assignDepartment(dept);
                employees.add(emp);
            }
        }

        System.out.println("\n-------- Employee Details --------");
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Department: " + ((Department) e).getDepartmentDetails());
        }

        sc.close();
    }
}

