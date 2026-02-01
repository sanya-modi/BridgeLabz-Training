package com.stream_api.doctor_availability;

public class Doctor {
	
	String name;
	String speciality;
	boolean availableOnWeekend;
	
	public Doctor(String name, String speciality, boolean availableOnWeekend) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.availableOnWeekend = availableOnWeekend;
	}

	public String getName() {
		return name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public boolean isAvailableOnWeekend() {
		return availableOnWeekend;
	}

	@Override
	public String toString() {
		return " name:" + name + ", speciality:" + speciality;
	}
	
	

}
