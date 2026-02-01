package com.collectors.order_revenue_summary;

import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Order> orderList = Arrays.asList(
		        new Order("Sanya", 1200.50),
		        new Order("Krishna", 850.00),
		        new Order("Sanya", 430.75),
		        new Order("Ak", 999.99),
		        new Order("Krishna", 1250.40),
		        new Order("Riya", 670.00),
		        new Order("Ak", 300.25),
		        new Order("Sanya", 2200.00),
		        new Order("Riya", 1500.60),
		        new Order("Krishna", 410.30)
		);
		
		Map<String, Double> totalAmountPerCustomer  = orderList.stream()
				                              .collect(Collectors.groupingBy(
				                            		  Order::getName,
				                            		  Collectors.summingDouble(Order::getOrderPrice)
				                            		  ));
		
		totalAmountPerCustomer.forEach((name, total) ->
        System.out.println(name + " -> " + total)
);
		
	}

}
