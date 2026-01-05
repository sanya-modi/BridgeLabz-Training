package swiftcart;

import java.util.Scanner;

/*
 * Dynamic Main class for SwiftCart Grocery App
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        int choice;

        do {
            System.out.println("\n===== SwiftCart Menu =====");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Apply Coupon Discount");
            System.out.println("3. Generate Bill");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // ---------------- ADD PRODUCT ----------------
                case 1:
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    sc.nextLine();
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.println("Select Product Type:");
                    System.out.println("1. Perishable Product");
                    System.out.println("2. Non-Perishable Product");
                    int type = sc.nextInt();

                    Product product;

                    if (type == 1) {
                        product = new PerishableProduct(
                                name, price, category, quantity);
                    } else {
                        product = new NonPerishableProduct(
                                name, price, category, quantity);
                    }

                    cart.addProduct(product);
                    System.out.println("Product added to cart");
                    break;

                // ---------------- APPLY DISCOUNT ----------------
                case 2:
                    System.out.print("Enter Coupon Amount: ");
                    double coupon = sc.nextDouble();
                    cart.applyDiscount(coupon);
                    System.out.println("Discount applied");
                    break;

                // ---------------- GENERATE BILL ----------------
                case 3:
                    cart.generateBill();
                    break;

                case 0:
                    System.out.println("Thank you for using SwiftCart!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
