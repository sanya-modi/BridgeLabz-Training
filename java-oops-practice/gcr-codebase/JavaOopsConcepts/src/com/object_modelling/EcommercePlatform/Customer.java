package com.object_modelling.EcommercePlatform;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println("Customer " + name + " placed an order.");
        order.showOrderDetails();
    }
}

