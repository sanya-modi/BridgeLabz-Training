import java.util.*;

public class StudentGrade{

    //Generate random 2-digit PCM marks
    public static int[][] generatePCMMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 90) + 10; 
            }
        }
        return marks;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            //Store result in 2D 
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    //Calculate grade based on percentage
    public static String[] calculateGrade(double[][] result) {
        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double p = result[i][2];
            if (p >= 80) grade[i] = "A";
            else if (p >= 70) grade[i] = "B";
            else if (p >= 60) grade[i] = "C";
            else if (p >= 50) grade[i] = "D";
            else if (p >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    //Display scorecard
    public static void displayScorecard(int[][] marks, double[][] result, String[] grade) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                grade[i]
            );
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = generatePCMMarks(students);
        double[][] result = calculateResults(marks);
        String[] grade = calculateGrade(result);
        displayScorecard(marks, result, grade);

        sc.close();
    }
}
