package com.functional_interface.paymet_gateway_integration;

public class CreditCard implements PaymentProcessor {
	
	 public void pay() {
		System.out.println("Payment using credit card");
	}
	
}
