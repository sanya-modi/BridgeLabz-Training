import java.util.Scanner;

public class StudentScore{

    // Method to generate random 2-digit PCM marks for students
    public static int[][] generatePCMMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
        for (int j = 0; j < 3; j++) {
        // 2-digit marks (10 to 99)
        marks[i][j] = (int) (Math.random() * 90) + 10;
        }
        }
        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to determine grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] results) {
        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                (int) results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t" +
                getGrade(results[i][2])
            );
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get input from user
        int students = sc.nextInt();
        int[][] pcmMarks = generatePCMMarks(students);
        double[][] results = calculateResults(pcmMarks);

        //Display result
        displayScoreCard(pcmMarks, results);

    }
}
