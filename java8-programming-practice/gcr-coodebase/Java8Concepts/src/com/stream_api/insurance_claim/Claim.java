package com.stream_api.insurance_claim;

public class Claim {
	
	int claimId;
	String claimType;
	double claimAmount;
	
	public Claim(int claimId, String claimType, double claimAmount) {
		this.claimId = claimId;
		this.claimType = claimType;
		this.claimAmount = claimAmount;
	}

	public int getClaimId() {
		return claimId;
	}

	public String getClaimType() {
		return claimType;
	}

	public double getClaimAmount() {
		return claimAmount;
	}	

}
