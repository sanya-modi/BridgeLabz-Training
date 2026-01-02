package com.abstraction_encapsulation_polymorphism.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {

    private double loanAmount;

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;   // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        this.loanAmount = amount;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

