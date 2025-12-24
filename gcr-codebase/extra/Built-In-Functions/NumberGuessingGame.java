import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random guess between low and high
    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }

    // Method to get user feedback
    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next();
    }

    // Method to update the guessing range
    public static int[] updateRange(String feedback, int guess, int low, int high) {
        if (feedback.equalsIgnoreCase("high")) {
            high = guess - 1;
        } else if (feedback.equalsIgnoreCase("low")) {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!guessedCorrectly) {

            int guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("I guessed your number correctly");
                guessedCorrectly = true;
            } else {
                int[] range = updateRange(feedback, guess, low, high);
                low = range[0];
                high = range[1];
            }
        }

        sc.close();
    }
}
