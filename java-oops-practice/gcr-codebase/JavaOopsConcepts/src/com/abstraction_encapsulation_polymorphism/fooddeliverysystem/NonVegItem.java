package com.abstraction_encapsulation_polymorphism.fooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

    private double extraCharge;
    private double discountRate;

    public NonVegItem(String name, double price, int quantity,
                      double extraCharge, double discountRate) {
        super(name, price, quantity);
        this.extraCharge = extraCharge;
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + extraCharge) * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * (discountRate / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: " + discountRate + "%";
    }
}

