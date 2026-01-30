package com.lambda_expression.notification_filtering;
import java.util.*;
import java.util.function.Predicate;

public class HostipalApp {
	
	public static void main(String[] args) {
		List<Patient> patientList= Arrays.asList(
				new Patient("Sam", "yes"),
				new Patient("Ak", "no"),
				new Patient("Kj", "no"),
				new Patient("Vk", "yes")
				);
		
		Predicate<Patient> notifyPatient = (patient) -> patient.preference.equalsIgnoreCase("yes");
		

        for (Patient p : patientList) {
            if (notifyPatient.test(p)) {
                System.out.println("Notify patient: " + p.name);
            }
        }
	}

}
