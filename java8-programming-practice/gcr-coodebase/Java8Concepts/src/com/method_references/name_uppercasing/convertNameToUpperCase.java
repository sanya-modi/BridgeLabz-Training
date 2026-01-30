package com.method_references.name_uppercasing;
import java.util.*;

public class convertNameToUpperCase {
	
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("sanya", 1),
				new Employee("ak", 2),
				new Employee("krishna", 3)
				);
		
		employeeList.stream()
		            .map(Employee::getName)
		            .map(String::toUpperCase)
	                .forEach(System.out::println);
		
	}
	
}
