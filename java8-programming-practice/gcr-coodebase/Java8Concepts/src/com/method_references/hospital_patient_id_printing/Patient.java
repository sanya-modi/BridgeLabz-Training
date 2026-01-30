package com.method_references.hospital_patient_id_printing;

public class Patient {
	String name;
	int id;
	
	public Patient(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient : [name=" + name + ", id=" + id + "]";
	}
	
	public static void printId(Patient p) {
	    System.out.println(p.id);
	}
}
