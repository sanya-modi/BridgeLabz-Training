package com.functional_interface.function.student_marks;

import java.util.function.Function;

public class StudentGrade {
	
	public static void main(String[] args) {
		Function<Integer, Character> checkGrade = (marks) -> {
			
			if(marks <= 100 && marks >=75 ) return 'A';
			else if(marks <75 && marks >=55) return 'B';
			return 'C';
		};
		
		System.out.println(checkGrade.apply(56));
		System.out.println(checkGrade.apply(95));
		System.out.println(checkGrade.apply(44));
		
	}

}
