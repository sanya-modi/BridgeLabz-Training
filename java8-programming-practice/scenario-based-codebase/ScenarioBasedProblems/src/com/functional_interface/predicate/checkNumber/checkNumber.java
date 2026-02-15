package com.functional_interface.predicate.checkNumber;

import java.util.function.Predicate;
import java.util.Scanner;

public class checkNumber {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		Predicate<Integer> isEven = (num) -> num%2==0;
		
		System.out.println("Enter your number to check");
		int n = sc.nextInt();
		if(isEven.test(n)) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}

}
