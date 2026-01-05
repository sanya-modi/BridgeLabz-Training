package campusconnect;

public class Student extends Person implements ICourseAction {
	
	private String grades;
	private Course course;
	
	public Student(String name, String email, int id, String grades) {
		super(name, email, id);
		this.grades = grades;
	}
	
	public double calculateGPA() {
		switch(grades) {
		case "A+" : return 10;
		case "A" : return 9.5;
		case "B+" : return 9;
		case "B" : return 8.5;
		case "C" : return 8;
 		}
		return 6.5;
	}
	
	@Override
	public void enrollCourse(Course course) {
		this.course = course;
		course.addStudent(this);
	}
	
	@Override
	public void dropCourse(Course course) {
		this.course = null;
		course.removeStudent(this);
	}

	@Override
	void printDetails() {
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Id : " + id);
		System.out.println("Grade : " + grades);
		System.out.println("GPA : " + calculateGPA());
		if (course != null) {
            System.out.println("Course: " + course.getCourseName());
        } else {
            System.out.println("Course: Not Enrolled");
        }
	}

}
