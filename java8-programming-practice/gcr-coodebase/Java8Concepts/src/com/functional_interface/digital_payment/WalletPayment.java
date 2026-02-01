package com.functional_interface.digital_payment;

public class WalletPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}