package com.object_modelling.CompanyAndDepartments;

public class DepartmentMain {

	public static void main(String[] args) {
		
		Company company = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee("Alice");
        dev.addEmployee("Bob");

        Department hr = new Department("HR");
        hr.addEmployee("Charlie");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.showCompanyDetails();

        // If company object is deleted, departments and employees are also deleted
        company = null;

	}

}
