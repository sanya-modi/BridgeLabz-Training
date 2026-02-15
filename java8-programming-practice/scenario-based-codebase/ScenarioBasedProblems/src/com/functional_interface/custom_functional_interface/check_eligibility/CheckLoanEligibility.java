package com.functional_interface.custom_functional_interface.check_eligibility;

interface FunctionalInterface{
	public String eligibilityCheck(double creditScore);
}

public class CheckLoanEligibility {
public static void main(String[] args) {
	FunctionalInterface isEligible = (creditScore) -> creditScore > 7.5 ? "Eligible" : "Not Eligible";
	System.out.println(isEligible.eligibilityCheck(8.0));
}
}
