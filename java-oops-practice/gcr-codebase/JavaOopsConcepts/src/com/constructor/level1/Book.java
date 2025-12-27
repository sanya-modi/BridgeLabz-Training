package com.constructor.level1;

public class Book {
	String title;
	String author;
	double price;
	
	Book(){
		this.title = "Sample Book";
		this.author = "XYZ";
		this.price = 100.0;
	}
	
	Book(String title, String author, double price){
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	public void display() {
	   System.out.println("title: " + title);
	   System.out.println("author: " + author);
	   System.out.println("price: " + price);
	   System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.display();
		Book b2 = new Book("History", "ABC", 700);
		b2.display();
	}

}
