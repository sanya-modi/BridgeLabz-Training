import java.util.Scanner;

public class VerifyNaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Check if the input is a natural number
        if (n >= 0) {
            //Calculate sum of n natural number using formula
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;
            //Calculate sum of n natural number using for loop
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both results are correct and equal");
            } 
	    else {
                System.out.println("Results are not equal");
            }
        } 
        //Not a natural number if input is negative
	else {
            System.out.println("The number is not a natural number");
        }
    }
}
