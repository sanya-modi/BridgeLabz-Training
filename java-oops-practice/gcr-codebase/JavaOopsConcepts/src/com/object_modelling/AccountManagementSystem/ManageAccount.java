package com.object_modelling.AccountManagementSystem;

public class ManageAccount {

	public static void main(String[] args) {
		
		    //Create object of class bank
		    Bank sbi = new Bank("SBI");
		    Bank hdfc = new Bank("HDFC");
		    //Create object of customer class
	        Customer customer1 = new Customer("Sanya", 10000);
	        Customer customer2 = new Customer("Shreya", 5500);
	        
	        sbi.openAccount(customer1);
	        customer1.viewBalance(sbi);

	        hdfc.openAccount(customer2);
	        customer2.viewBalance(hdfc);
	}

}
