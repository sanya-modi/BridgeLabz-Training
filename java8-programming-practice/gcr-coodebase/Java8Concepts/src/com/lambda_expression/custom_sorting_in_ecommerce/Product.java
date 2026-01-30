package com.lambda_expression.custom_sorting_in_ecommerce;

public class Product {
	
	double price;
	double rating;
	double discount;
	
	public Product(double price, double rating, double discount) {
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}
	
    @Override
    public String toString() {
        return "Product [price=" + price +
               ", rating=" + rating +
               ", discount=" + discount + "]";
    }

}
