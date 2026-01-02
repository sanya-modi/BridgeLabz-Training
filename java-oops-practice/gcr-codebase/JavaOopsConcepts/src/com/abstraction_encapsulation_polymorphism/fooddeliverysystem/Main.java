package com.abstraction_encapsulation_polymorphism.fooddeliverysystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<FoodItem> order = new ArrayList<>();

        System.out.print("Enter number of food items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Veg Item\n2. Non-Veg Item");
            System.out.print("Choose item type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Item Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            if (choice == 1) {
                System.out.print("Discount Rate (%): ");
                double discount = sc.nextDouble();

                order.add(new VegItem(name, price, quantity, discount));
            }
            else {
                System.out.print("Extra Charge (Non-Veg): ");
                double extra = sc.nextDouble();

                System.out.print("Discount Rate (%): ");
                double discount = sc.nextDouble();

                order.add(new NonVegItem(name, price, quantity, extra, discount));
            }
        }

        System.out.println("\n----- Order Summary -----");

        double grandTotal = 0;

        for (FoodItem item : order) {

            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice = totalPrice - discount;
            grandTotal += finalPrice;

            System.out.println("Total Price: " + totalPrice);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("--------------------------------");
        }

        System.out.println("Grand Total: " + grandTotal);
        sc.close();
    }
}

