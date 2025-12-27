package com.constructor.level1;

public class ProductInventory {
	
	// Instance variables 
    String productName;
    double price;

    // Class variable 
    static int totalProducts = 0;

    // Constructor
    ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        // increase count whenever a product is created
        totalProducts++;  
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println();
    }

    // Class method 
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

}
