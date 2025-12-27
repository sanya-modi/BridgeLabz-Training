package com.constructor.level1;

public class LibraryBookTypeMain {

	public static void main(String[] args) {
		
		LibraryEbook ebook = new LibraryEbook(
                "978-0134685991",
                "Effective Java",
                "Joshua Bloch",
                5.2
        );

        ebook.displayEBookDetails();

        // Modifying private variable using setter
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());

	}

}
