package com.abstraction_encapsulation_polymorphism.ecommerceplatform;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Electronics\n2. Clothing\n3. Groceries");
            System.out.print("Choose product type: ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (type == 1) {
                System.out.print("Discount Rate (%): ");
                double discount = sc.nextDouble();

                System.out.print("Tax Rate (%): ");
                double tax = sc.nextDouble();

                products.add(new Electronics(id, name, price, discount, tax));
            }
            else if (type == 2) {
                System.out.print("Discount Rate (%): ");
                double discount = sc.nextDouble();

                System.out.print("Tax Rate (%): ");
                double tax = sc.nextDouble();

                products.add(new Clothing(id, name, price, discount, tax));
            }
            else if (type == 3) {
                System.out.print("Discount Rate (%): ");
                double discount = sc.nextDouble();

                products.add(new Groceries(id, name, price, discount));
            }
        }

        System.out.println("\n----- Final Price Details -----");

        for (Product p : products) {

            double finalPrice = p.getPrice() - p.calculateDiscount();

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                finalPrice += t.calculateTax();
                System.out.println(t.getTaxDetails());
            }

            System.out.println(
                    "Product: " + p.getName() +
                    " | Final Price: " + finalPrice
            );
            System.out.println();
        }

        sc.close();
    }
}
