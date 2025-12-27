package com.constructor.level1;

public class Person {

	 String name;
	    int age;

	    // 1️⃣ Parameterized constructor
	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // 2️⃣ Copy constructor
	    Person(Person other) {
	        this.name = other.name;
	        this.age = other.age;
	    }

	    // Method to display details
	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
}
