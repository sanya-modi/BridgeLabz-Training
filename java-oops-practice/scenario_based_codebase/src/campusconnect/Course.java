package campusconnect;
import java.util.*;

public class Course {
	
	List<Student> students = new ArrayList<>();
	private Faculty faculty;
	private String courseName;
	
	public Course(String courseName, Faculty faculty) {
		this.courseName = courseName;
		this.faculty = faculty;
		this.students = new ArrayList<>();
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
}
