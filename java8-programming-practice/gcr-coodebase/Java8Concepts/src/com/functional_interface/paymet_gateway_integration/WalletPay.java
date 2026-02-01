package com.functional_interface.paymet_gateway_integration;

public class WalletPay implements PaymentProcessor{
	
	public void pay() {
		System.out.println("Payment using wallet pay");
	}
	
	public void newRefund(double amount) {
		System.out.println("Refund added of amount " + amount + " using wallet method");
	}
}
