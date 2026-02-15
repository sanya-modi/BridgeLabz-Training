package com.functional_interface.custom_functional_interface.calculatebonus;

 interface FunctionalInterface{
	public double bonusCalculation(double salary, int year, int hour);
}

public class CalculateBonus {
	public static void main(String[] args) {
		//lambda expression
		FunctionalInterface bonus = (salary, year, hour) -> salary * year * hour;
	    System.out.println("Bounus : " + bonus.bonusCalculation(70000, 5, 12));
	}
}
