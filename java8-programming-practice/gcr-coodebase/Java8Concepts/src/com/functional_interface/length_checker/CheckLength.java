package com.functional_interface.length_checker;

import java.util.*;
import java.util.function.*;

public class CheckLength {
	
	public static void main(String[] args) {
		List<String> message = Arrays.asList("hi, my name is sanya modi. I am 21 years old",
				 "Scenario: Check if a message exceeds character limit.",
				 "Task: Create a static method in an interface SecurityUtils to check password strength.",
				 "Hiiiiiiiiii"
				);
		
		int limit = 65;
		
		Function<String, Integer> calculate = (msg) -> {
			return msg.length();
		};
		
		for(String msg : message) {
			if(calculate.apply(msg) >= limit) {
				System.out.println("Message exceeds character limit : " + msg);
			}
		}
	}

}
