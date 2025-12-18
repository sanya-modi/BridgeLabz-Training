import java.util.Scanner;

public class SumOfNaturalNumberUSingFormula{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        //Get integer input
        int number = sc.nextInt();

        //Print sum of n natural numbers
        if (number >= 0) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } 
        else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}