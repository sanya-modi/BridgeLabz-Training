package com.collectors.employee_salary;

import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
		        new Employee("Sanya", "IT", 75000),
		        new Employee("Krishna", "HR", 52000),
		        new Employee("Ak", "IT", 68000),
		        new Employee("Riya", "Finance", 82000),
		        new Employee("Vansh", "HR", 48000),
		        new Employee("Astha", "Finance", 90000),
		        new Employee("Shreya", "IT", 61000),
		        new Employee("Shaan", "Marketing", 58000),
		        new Employee("Vk", "Marketing", 63000),
		        new Employee("Ananya", "Finance", 77000)
		);
		
		Map<String, Double> avgSalaryByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary)));
		
		 avgSalaryByDept.forEach((dept, avgSalary) ->
         System.out.println(dept + " -> " + avgSalary)
 );
	}

}
