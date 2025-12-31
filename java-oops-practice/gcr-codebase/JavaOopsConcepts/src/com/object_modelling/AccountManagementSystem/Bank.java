package com.object_modelling.AccountManagementSystem;

public class Bank {
	
	   private String bankName;

	    public Bank(String bankName) {
	        this.bankName = bankName;
	    }

	    public void openAccount(Customer customer) {
	        System.out.println("Account opened for " + customer.getName()
	                + " in " + bankName);
	    }

	    public String getBankName() {
	        return bankName;
	    }
    
}
