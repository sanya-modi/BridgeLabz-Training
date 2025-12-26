import java.util.*;

public class ElectionBoothManager {
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.print("\nEnter age (-1 to exit): ");
            int age = scanner.nextInt();

            // Exit condition
            if (age == -1) {
                System.out.println("\nVoting closed.");
                break;
            }

            // Eligibility check
            if (age < 18) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            // Voting process
            System.out.println("Cast your vote:");
            System.out.println("1 - Candidate A");
            System.out.println("2 - Candidate B");
            System.out.println("3 - Candidate C");

            System.out.print("Enter your choice: ");
            int vote = scanner.nextInt();

            // Record vote using switch
            switch (vote) {
                case 1:
                    candidate1Votes++;
                    System.out.println("Vote recorded for Candidate A.");
                    break;
                case 2:
                    candidate2Votes++;
                    System.out.println("Vote recorded for Candidate B.");
                    break;
                case 3:
                    candidate3Votes++;
                    System.out.println("Vote recorded for Candidate C.");
                    break;
                default:
                    System.out.println("Invalid vote. Vote not recorded.");
            }
        }

        // Final result
        System.out.println("\n----- Election Results -----");
        System.out.println("Candidate A Votes: " + candidate1Votes);
        System.out.println("Candidate B Votes: " + candidate2Votes);
        System.out.println("Candidate C Votes: " + candidate3Votes);
        System.out.println("----------------------------");

        scanner.close();
    }

}
