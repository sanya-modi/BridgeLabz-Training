package com.constructor.level1;
import java.util.*;

public class CircleMain {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);	
		
		//Initialize object by default constructor
	    Circle c1 = new Circle();
	    c1.displayRadius();
	    
	    //Initialize object using parameterized constructor
	    Circle c2 = new Circle(24.6);
	    c2.displayRadius();
	}

}
