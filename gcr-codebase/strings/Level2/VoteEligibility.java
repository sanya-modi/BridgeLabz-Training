import java.util.Scanner;

public class VoteEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // random 2-digit age (10 to 99)
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } 
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            } 
            else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Method to display result in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("---------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 1: Generate random ages
        int[] ages = generateAges(n);
        // Step 2: Check voting eligibility
        String[][] votingData = checkVotingEligibility(ages);
        // Step 3: Display result
        displayResult(votingData);

    }
}
