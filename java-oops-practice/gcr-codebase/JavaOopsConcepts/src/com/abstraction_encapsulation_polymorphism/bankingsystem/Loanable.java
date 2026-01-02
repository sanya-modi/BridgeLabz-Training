package com.abstraction_encapsulation_polymorphism.bankingsystem;

public interface Loanable {

    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}

