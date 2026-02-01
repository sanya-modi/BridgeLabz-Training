package com.functional_interface.unit_convertion_tool;

public class ConversionApp {
	
	public static void main(String[] args) {
		
		double kg = 23;
		double km = 34;
		
		System.out.println(UnitConvertion.kgToIbs(kg));
		System.out.println(UnitConvertion.kmToMiles(km));
	}

}
