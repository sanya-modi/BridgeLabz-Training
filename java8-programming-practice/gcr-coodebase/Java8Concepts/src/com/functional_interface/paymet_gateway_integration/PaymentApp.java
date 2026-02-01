package com.functional_interface.paymet_gateway_integration;

public class PaymentApp {
	
	public static void main(String[] args) {
		
		CreditCard card = new CreditCard();
		WalletPay wallet = new WalletPay();
		
		card.pay();
		card.newRefund(5000);
		
		wallet.pay();
		wallet.newRefund(2000);
	}

}
