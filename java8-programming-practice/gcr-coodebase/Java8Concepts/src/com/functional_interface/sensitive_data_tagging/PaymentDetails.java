package com.functional_interface.sensitive_data_tagging;

public class PaymentDetails implements Encrypted{
	
	String cardHolderName;
	String bankName;
	
	public PaymentDetails(String cardHolderName, String bankName) {
		this.cardHolderName = cardHolderName;
		this.bankName = bankName;
	}
	
}
