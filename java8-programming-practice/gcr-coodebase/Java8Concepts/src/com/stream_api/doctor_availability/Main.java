package com.stream_api.doctor_availability;
import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Doctor> doctorList = Arrays.asList(
		        new Doctor("Dr. A Sharma", "Cardiologist", true),
		        new Doctor("Dr. R Mehta", "Dermatologist", false),
		        new Doctor("Dr. S Gupta", "Neurologist", true),
		        new Doctor("Dr. P Verma", "Orthopedic", false),
		        new Doctor("Dr. N Singh", "Pediatrician", true),
		        new Doctor("Dr. K Iyer", "Gynecologist", true),
		        new Doctor("Dr. M Khan", "ENT Specialist", false),
		        new Doctor("Dr. L Joshi", "Psychiatrist", true),
		        new Doctor("Dr. V Patel", "General Physician", true),
		        new Doctor("Dr. T Malhotra", "Oncologist", false)
		);
		
		doctorList.stream()
		          .filter(Doctor::isAvailableOnWeekend)
		          .sorted(Comparator.comparing(Doctor::getSpeciality))
		          .forEach(System.out::println);
		
	}

}
