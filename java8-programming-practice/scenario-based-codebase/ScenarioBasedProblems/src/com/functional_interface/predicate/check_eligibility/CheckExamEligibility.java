package com.functional_interface.predicate.check_eligibility;

import java.util.function.Predicate;

public class CheckExamEligibility {
	public static void main(String[] args) {
		
		Predicate<Double> checkEligibility = (attendance) -> attendance >= 75 ? true : false;
		
		System.out.println(checkEligibility.test(67d));
		System.out.println(checkEligibility.test(78d));
		
	}
}
