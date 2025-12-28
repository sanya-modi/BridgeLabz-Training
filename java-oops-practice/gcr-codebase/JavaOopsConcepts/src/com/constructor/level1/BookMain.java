package com.constructor.level1;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize object using default constructor
		Book book1 = new Book();
		book1.display();
		//Initialize object using parameterizes constructor
		Book book2 = new Book("History", "ABC", 700);
		book2.display();
	}

}
