package com.object_modelling.AccountManagementSystem;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void viewBalance(Bank bank) {
        System.out.println(
            name + "'s balance in " + bank.getBankName() + " is ₹" + balance
        );
    }
}

