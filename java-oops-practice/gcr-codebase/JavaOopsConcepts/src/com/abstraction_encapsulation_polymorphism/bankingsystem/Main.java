package com.abstraction_encapsulation_polymorphism.bankingsystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Savings Account\n2. Current Account");
            System.out.print("Choose account type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount account;

            if (choice == 1) {
                account = new SavingsAccount(accNo, name, balance);
            } else {
                account = new CurrentAccount(accNo, name, balance);
            }

            System.out.print("Deposit Amount: ");
            account.deposit(sc.nextDouble());

            System.out.print("Withdraw Amount: ");
            account.withdraw(sc.nextDouble());

            accounts.add(account);
        }

        System.out.println("\n----- Account Summary -----");

        for (BankAccount acc : accounts) {

            acc.displayDetails();

            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;

                System.out.print("Enter loan amount to apply: ");
                double loanAmount = sc.nextDouble();

                loanAcc.applyForLoan(loanAmount);

                if (loanAcc.calculateLoanEligibility()) {
                    System.out.println("Loan Approved");
                } else {
                    System.out.println("Loan Not Approved");
                }
            }

            System.out.println("--------------------------------");
        }

        sc.close();
    }
}

