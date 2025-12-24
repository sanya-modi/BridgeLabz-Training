import java.util.Scanner;

public class MaximumOfThree {

    // Method to find maximum
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // Method to take input
    public static int[] takeInput(Scanner sc) {
        int[] nums = new int[3];
        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();
        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();
        System.out.print("Enter third number: ");
        nums[2] = sc.nextInt();
        return nums;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take user input and call the method
        int[] numbers = takeInput(sc);
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);

        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}
