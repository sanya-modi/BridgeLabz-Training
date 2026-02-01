package com.functional_interface.paymet_gateway_integration;

public interface PaymentProcessor {
	
	public void pay();
	
	default void newRefund(double amount) {
		System.out.println("Refund added of amount " + amount + " using standard method");
	}

}
