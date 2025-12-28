package com.constructor.level1;

public class SavingAccount extends BankAccount {

	//Instance Variable
	double interestRate;

    // Parameterized Constructor
    SavingAccount(String accountNumber, String accountHolder,
                   double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method displaying account details
    void displaySavingsAccountDetails() {
        System.out.println("Account Number : " + accountNumber);   
        System.out.println("Account Holder : " + accountHolder);   
        System.out.println("Balance        : ₹" + getBalance());   
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println();
    }
	
}
