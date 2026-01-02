package com.abstraction_encapsulation_polymorphism.fooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {

    private double discountRate;

    public VegItem(String name, double price, int quantity, double discountRate) {
        super(name, price, quantity);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * (discountRate / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: " + discountRate + "%";
    }
}

