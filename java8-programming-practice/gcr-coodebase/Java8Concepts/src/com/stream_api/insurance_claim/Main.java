package com.stream_api.insurance_claim;
import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Claim> claimList = Arrays.asList(
		        new Claim(101, "Health", 45000),
		        new Claim(102, "Health", 32000),
		        new Claim(103, "Health", 58000),

		        new Claim(201, "Vehicle", 15000),
		        new Claim(202, "Vehicle", 22000),
		        new Claim(203, "Vehicle", 18000),

		        new Claim(301, "Home", 75000),
		        new Claim(302, "Home", 64000),
		        new Claim(303, "Home", 82000),

		        new Claim(401, "Travel", 12000),
		        new Claim(402, "Travel", 9000)
		);
		
        Map<String, Double> avgClaimByType =
                claimList.stream()
                        .collect(Collectors.groupingBy(
                                Claim::getClaimType,
                                Collectors.averagingDouble(Claim::getClaimAmount)
                        ));

        avgClaimByType.forEach((type, avg) ->
                System.out.println(type + " → Average Claim Amount: " + avg)
        );

		
	}

}
