package com.collectors.student_result_grouping;
import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
		        new Student("Sanya", "A"),
		        new Student("Krishna", "B"),
		        new Student("Ak", "A"),
		        new Student("Riya", "C"),
		        new Student("Vansh", "B"),
		        new Student("Astha", "A"),
		        new Student("Shreya", "C"),
		        new Student("Shaan", "B"),
		        new Student("Vk", "A"),
		        new Student("Ananya", "C")
		);
		
		Map<String, List<Student>> groupedStudents =
		        students.stream()
		                .collect(Collectors.groupingBy(
		                        Student::getGradeLevel,
		                        TreeMap::new,        
		                        Collectors.toList()
		                ));

		groupedStudents.forEach((grade, studentList) -> {
		    System.out.println("Grade: " + grade);

		    studentList.stream()                
		               .sorted(Comparator.comparing(Student::getName))
		               .forEach(student ->
		                       System.out.println("  " + student.getName())
		               );
		});


	}

}
