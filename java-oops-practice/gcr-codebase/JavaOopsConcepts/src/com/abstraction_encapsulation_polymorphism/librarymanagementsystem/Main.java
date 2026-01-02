package com.abstraction_encapsulation_polymorphism.librarymanagementsystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<LibraryItem> items = new ArrayList<>();

        System.out.print("Enter number of library items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Book\n2. Magazine\n3. DVD");
            System.out.print("Choose item type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Item ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            LibraryItem item;

            if (choice == 1) {
                item = new Book(id, title, author);
            } else if (choice == 2) {
                item = new Magazine(id, title, author);
            } else {
                item = new DVD(id, title, author);
            }

            items.add(item);
        }

        System.out.println("\n----- Library Items -----");

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;

                if (r.checkAvailability()) {
                    System.out.print("Reserve this item? (yes/no): ");
                    String ans = sc.nextLine();

                    if (ans.equalsIgnoreCase("yes")) {
                        System.out.print("Borrower Name: ");
                        String name = sc.nextLine();
                        r.reserveItem(name);
                        System.out.println("Item reserved successfully");
                    }
                } else {
                    System.out.println("Item already reserved");
                }
            }

            System.out.println("--------------------------------");
        }

        sc.close();
    }
}

