package com.constructor.level1;

public class ProductInventoryMain {

	public static void main(String[] args) {
		
		//create and initialize 1st object
		ProductInventory p1 = new ProductInventory("Laptop", 55000);
		p1.displayProductDetails();
		
		//create and initialize 2st object
		ProductInventory p2 = new ProductInventory("Headphones", 2500);
		p2.displayProductDetails();
		
		//create and initialize 3st object
		ProductInventory p3 = new ProductInventory("Keyboard", 1500);
        p3.displayProductDetails();

        //Display total number of products(object crreated)
        ProductInventory.displayTotalProducts();

	}

}
