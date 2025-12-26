import java.util.Scanner;

public class ResultGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int numberOfSubjects = 5;

        // Input marks using for-loop
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();

            // Basic validation
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter between 0 and 100.");
                i--; // Repeat current subject
                continue;
            }

            totalMarks += marks;
        }

        // Calculate average
        double average = totalMarks / (double) numberOfSubjects;

        // Convert average to grade key
        int gradeKey;

        if (average >= 75) {
            gradeKey = 1;
        } else if (average >= 60) {
            gradeKey = 2;
        } else if (average >= 50) {
            gradeKey = 3;
        } else {
            gradeKey = 4;
        }

        // Assign grade using switch
        switch (gradeKey) {
            case 1:
                System.out.println("\nGrade: A");
                break;
            case 2:
                System.out.println("\nGrade: B");
                break;
            case 3:
                System.out.println("\nGrade: C");
                break;
            default:
                System.out.println("\nGrade: F");
        }

        // Output results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);

        scanner.close();
    }
}
