package com.functional_interface.digital_payment;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}
