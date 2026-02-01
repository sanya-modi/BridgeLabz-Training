package com.functional_interface.unit_convertion_tool;

public interface UnitConvertion {
	
	public static double kmToMiles(double km){
		double miles = km * 0.621;
		return miles;
	}
	
	public static double kgToIbs(double kg){
		double Ibs = kg * 2.204;
		return Ibs;
	}

}
