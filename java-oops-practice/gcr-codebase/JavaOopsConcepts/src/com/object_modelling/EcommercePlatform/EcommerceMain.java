package com.object_modelling.EcommercePlatform;

public class EcommerceMain {
	
	 public static void main(String[] args) {

	        Customer customer = new Customer("Sanya");

	        Product p1 = new Product("Laptop", 60000);
	        Product p2 = new Product("Mouse", 800);

	        Order order = new Order(101);
	        order.addProduct(p1);
	        order.addProduct(p2);

	        customer.placeOrder(order);
	    }

}
