package com.functional_interface.custom_functional_interface.calculate_tax;

interface FunctionalInterface{
	public double taxCalculation(double salary, double tax);
}

public class CalculateTax {
public static void main(String[] args) {
	FunctionalInterface calculateTax = (salary, tax) -> salary * (tax/100);
	System.out.println("Tax : " + calculateTax.taxCalculation(15000, 3));
}
}
