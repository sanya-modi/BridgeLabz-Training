package com.constructor.level1;

public class BankMain {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount("ACC12345","Sanya",50000,4.5);

        sa.displaySavingsAccountDetails();

        // Modifying balance using public methods
        sa.deposit(10000);
        sa.withdraw(5000);

        System.out.println("Updated Balance: ₹" + sa.getBalance());

	}

}
