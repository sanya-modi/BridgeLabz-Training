package com.constructor.level1;

public class Book {
	//attributes
	String title;
	String author;
	double price;
	
	//Default constructor
	Book(){
		this.title = "Sample Book";
		this.author = "XYZ";
		this.price = 100.0;
	}
	
	//Parameterized constructor
	Book(String title, String author, double price){
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	//Display the properties 
	public void display() {
	   System.out.println("title: " + title);
	   System.out.println("author: " + author);
	   System.out.println("price: " + price);
	   System.out.println();
	}

}
