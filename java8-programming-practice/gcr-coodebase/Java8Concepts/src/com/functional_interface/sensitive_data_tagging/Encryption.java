package com.functional_interface.sensitive_data_tagging;

public class Encryption {
	
	public static void encryptedData(Object obj) {
		if(obj instanceof Encrypted) {
			System.out.println("Data is encrypted for : " + obj.getClass().getSimpleName());
		}
		else {
			System.out.println("Data is not encrypted for : " + obj.getClass().getSimpleName());
		}
	}

}
