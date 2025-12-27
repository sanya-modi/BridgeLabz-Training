package com.constructor.level1;

public class PersonMain {

	public static void main(String[] args) {
		//Initialized object using parameterized constructor 
		Person p1 = new Person("Sanya", 22);
		p1.display();
		
		// cloning p1 using copy constructor
        Person p2 = new Person(p1);   
        p2.display();
	}

}
