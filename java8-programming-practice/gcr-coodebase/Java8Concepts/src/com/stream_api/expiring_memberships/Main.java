package com.stream_api.expiring_memberships;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	
	  public static void main(String[] args) {

	        List<GymMember> members = Arrays.asList(
	                new GymMember("Sanya", LocalDate.now().plusDays(10)),
	                new GymMember("Ak", LocalDate.now().plusDays(40)),
	                new GymMember("Krishna", LocalDate.now().plusDays(25)),
	                new GymMember("Riya", LocalDate.now().minusDays(2)),
	                new GymMember("Aman", LocalDate.now().plusDays(5))
	        );

	        LocalDate today = LocalDate.now();
	        LocalDate next30Days = today.plusDays(30);

	        List<GymMember> expiringSoon = members.stream()
	                .filter(m -> !m.getExpiryDate().isBefore(today))   // not already expired
	                .filter(m -> !m.getExpiryDate().isAfter(next30Days)) // within 30 days
	                .collect(Collectors.toList());

	        expiringSoon.forEach(System.out::println);
	    }

}
