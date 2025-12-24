import java.util.Scanner;

public class FibonacciSequence {

    // Method to generate and print Fibonacci sequence
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        //Call the method
        printFibonacci(n);

        sc.close();
    }
}
