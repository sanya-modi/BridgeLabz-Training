package com.functional_interface.password_strength_validator;

public class ValidatorApp {
	
	 public static void main(String[] args) {

	        String password1 = "Sanya@123";
	        String password2 = "weakpass";

	        System.out.println("Password1 strong? " +
	                SecurityUtils.isStrongPassword(password1));

	        System.out.println("Password2 strong? " +
	                SecurityUtils.isStrongPassword(password2));
	    }

}
