import java.util.Scanner;

public class GcdLcmCalculator {

    // Function to calculate GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Function to calculate LCM
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        //Call the method
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        //Display the result
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);

        sc.close();
    }
}
