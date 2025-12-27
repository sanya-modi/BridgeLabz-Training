package com.constructor.level1;

public class Circle {
	
	//attribute
	double radius;
	
	//default value of radius
	Circle(){
		this(10.5);
	}
	
	//user-defined value of radius
	Circle(double radius){
		this.radius = radius;
	}
	
	//Method to diplay radius
	public void displayRadius() {
		System.out.println(radius);
	}

}
