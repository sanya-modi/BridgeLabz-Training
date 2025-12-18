import java.util.Scanner;

public class NaturalNumberSumComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Check if the input is a natural number
        if (n >= 0) {
            //Calculate sum of n natural number using formula
            int formulaSum = n * (n + 1) / 2;

            int loopSum = 0;
            int i = 1;
            //Calculate sum of n natural number using while loop
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

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
