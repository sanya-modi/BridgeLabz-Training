package com.stream_api.transforming_names;

import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Customer>  customerList = Arrays.asList(
				new Customer("Sanya"),
				new Customer("krishna"),
				new Customer("ak"),
				new Customer("vansh"),
				new Customer("riya"),
				new Customer("vk"),
				new Customer("astha"),
				new Customer("shreya"),
				new Customer("shaan")
				);
		
		customerList.stream()
		            .map(Customer::getName)
		            .map(String::toUpperCase)
		            .sorted()
		            .forEach(System.out::println);
 		
	}

}
