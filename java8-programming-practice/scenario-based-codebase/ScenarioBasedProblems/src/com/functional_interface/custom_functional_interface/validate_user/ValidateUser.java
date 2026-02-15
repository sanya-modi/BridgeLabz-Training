package com.functional_interface.custom_functional_interface.validate_user;

interface LoginValidator {
    boolean validate(String username, String password);
}

public class ValidateUser {
	
	public static void main(String[] args) {
		
		
		LoginValidator loginValidator =
                (username, password) ->
                        username.equals("admin") && password.equals("admin123");

        // Test cases
        System.out.println(loginValidator.validate("admin", "admin123"));
        System.out.println(loginValidator.validate("admin", "wrongpass"));
		
	}

}
