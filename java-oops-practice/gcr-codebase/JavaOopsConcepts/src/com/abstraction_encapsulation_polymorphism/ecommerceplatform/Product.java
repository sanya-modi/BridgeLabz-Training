package com.abstraction_encapsulation_polymorphism.ecommerceplatform;

public abstract class Product {
	
	private int productId;
	private String name;
	private double price;
	
	Product(int productId, String name, double price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	// controlled update
    public void setPrice(double price) {
        this.price = price;
    }

    // each product decides its own discount logic
    public abstract double calculateDiscount();
	
}
