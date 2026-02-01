package com.functional_interface.sensitive_data_tagging;

public class Main {
	
	public static void main(String[] args) {
		UserProfile user = new UserProfile("sanya", 21);
		PaymentDetails payment = new PaymentDetails("Sanya", "HDFC");
		TempCache temp = new TempCache();
		
		Encryption.encryptedData(user);
		Encryption.encryptedData(payment);
		Encryption.encryptedData(temp);
	}

}
