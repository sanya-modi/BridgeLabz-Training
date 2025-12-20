import java.util.Scanner;

public class Factors{

    // Method to find factors and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop: count factors
        for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
        count++;
        }
        }
        // Initialize array with count
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

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
        sum += factor;
        }
    return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
        product *= factor;
        }
    return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
    return sum;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("\nFactors:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\n\nSum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

    }
}
