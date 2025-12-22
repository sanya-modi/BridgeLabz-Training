import java.util.Scanner;

public class NumberChecker5 {

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
        if (number % i == 0) {
        sum += i;
        }
        }
        return sum;
    }

    // Method to check Perfect Number
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) == number;
    }

    // Method to check Abundant Number
    public static boolean isAbundantNumber(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) > number;
    }

    // Method to check Deficient Number
    public static boolean isDeficientNumber(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) < number;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
        fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int n = number;
        while (n != 0) {
        int digit = n % 10;
        sum += factorial(digit);
        n /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get user input
        int number = sc.nextInt();

        System.out.println("\n--- Number Checker Results ---");
        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrongNumber(number));

    }
}

