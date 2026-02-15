package com.functional_interface.predicate.validate_amount;

import java.util.function.Predicate;

public class validateWithdrawalAmount {
	
	public static void main(String[] args) {
		
		Predicate<Long> checkAmount = (amount) -> (amount>0 && amount<=100000);
		
		System.out.println(checkAmount.test(50000l));
	}

}
