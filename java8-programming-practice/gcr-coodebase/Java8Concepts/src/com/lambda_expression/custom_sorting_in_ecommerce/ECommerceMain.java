package com.lambda_expression.custom_sorting_in_ecommerce;
import java.util.*;

public class ECommerceMain {
	
	public static void main(String[] args) {
		List<Product> product = Arrays.asList(
				new Product(500, 3.5, 6),
				new Product(900, 2.5, 6),
				new Product(600,5.0, 8)
				);
		
		Comparator<Product> sortByPrice = (product1, product2) -> Double.compare(product2.price, product1.price);
		
Collections.sort(product, sortByPrice);
		System.out.println("-----Sort By Price-----");
		for(Product p : product) {
			System.out.println(p);
		}
		
		Comparator<Product> sortByRating = (product1, product2) -> Double.compare(product2.rating, product1.rating);
		
Collections.sort(product, sortByRating);
System.out.println("-----Sort By Rate-----");
		for(Product p : product) {
			System.out.println(p);
		}
		
		Comparator<Product> sortByDiscount = (product1, product2) -> Double.compare(product2.discount, product1.discount);
		
		Collections.sort(product, sortByDiscount);
		System.out.println("-----Sort By Discount-----");
		for(Product p : product) {
			System.out.println(p);
		}
		
		
	}

}
