package com.functional_interface.predicate.checkDeliveryFee;

import java.util.function.Predicate;

public class FreeDeliveryCheck {
	
	public static void main(String[] args) {
		// Predicate to check free delivery eligibility
        Predicate<Double> isEligibleForFreeDelivery =
                orderAmount -> orderAmount >= 500;

        System.out.println(isEligibleForFreeDelivery.test(299.99)); // false
        System.out.println(isEligibleForFreeDelivery.test(500.00)); // true
        System.out.println(isEligibleForFreeDelivery.test(1299.50)); // true
	}

}
