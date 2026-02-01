package com.collectors.student_result_grouping;

public class Student {
	
	String name;
	String gradeLevel;
	
	public Student(String name, String gradeLevel) {
		this.name = name;
		this.gradeLevel = gradeLevel;
	}

	public String getName() {
		return name;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	@Override
	public String toString() {
		return "name:" + name + ", gradeLevel:" + gradeLevel;
	}
	
	

}
