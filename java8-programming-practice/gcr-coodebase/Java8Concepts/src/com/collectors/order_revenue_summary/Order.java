package com.collectors.order_revenue_summary;

public class Order {
	
	String name;
	double orderPrice;
	
	public Order(String name, double order) {
		this.name = name;
		this.orderPrice = order;
	}

	public String getName() {
		return name;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	@Override
	public String toString() {
		return "name:" + name + ", order:" + orderPrice ;
	}
	
	

}
