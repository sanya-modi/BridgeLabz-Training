package campusconnect;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Faculty dynamically
        System.out.println("Enter Faculty Name:");
        String fname = sc.nextLine();

        System.out.println("Enter Faculty Email:");
        String femail = sc.nextLine();

        System.out.println("Enter Faculty Id:");
        int fid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Department:");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fname, femail, fid, dept);

        // Create Course dynamically
        System.out.println("\nEnter Course Name:");
        String courseName = sc.nextLine();

        Course course = new Course(courseName, faculty);

        // Create Student dynamically
        System.out.println("\nEnter Student Name:");
        String sname = sc.nextLine();

        System.out.println("Enter Student Email:");
        String semail = sc.nextLine();

        System.out.println("Enter Student Id:");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Grade (A+, A, B+, B, C):");
        String grade = sc.nextLine();

        Student student = new Student(sname, semail, sid, grade);

        int choice;
        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Enroll Course");
            System.out.println("2. Drop Course");
            System.out.println("3. Print Student Details");
            System.out.println("4. Print Faculty Details");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    student.enrollCourse(course);
                    System.out.println("Student enrolled successfully.");
                    break;

                case 2:
                    student.dropCourse(course);
                    System.out.println("Student dropped from course.");
                    break;

                case 3:
                    student.printDetails();
                    break;

                case 4:
                    faculty.printDetails();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}