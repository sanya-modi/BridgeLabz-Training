import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get an integer input
        int num = sc.nextInt();

        //Check if the input is a natural number
        if (num >= 0) {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            //Display the factorial of the number 
            System.out.println("The factorial of " + num + " is " + factorial);
        }
        else {
            System.out.println("The number is not a natural number");
        }
    }
}
