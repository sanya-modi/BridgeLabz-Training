import java.util.Scanner;

public class FactorOperation{

    // Method to find factors of a number and return as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop: count number of factors
        for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
        count++;
        }
        }
        // Create array with exact size
        int[] factors = new int[count];
        int index = 0;
        // Second loop: store factors
        for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
        factors[index++] = i;
        }
        }
        return factors;
    }

    // Method to find greatest factor using factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int f : factors) {
        if (f > greatest) {
        greatest = f;
        }
        }
        return greatest;
    }

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
        sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
        product *= f;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
        product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get an input from user
        int number = sc.nextInt();
        int[] factors = findFactors(number);

        //Display the result
        System.out.print("\nFactors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println("\n\nGreatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));

    }
}
