import java.util.Scanner;

public class HarshadNumber{

    // Method to count digits
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int n = number;
        while (n != 0) {
        count++;
        n /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = count - 1;
        int n = number;
        while (n != 0) {
            digits[index--] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
        sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static double findSumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int d : digits) {
        sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findSumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        // Initialize digit column
        for (int i = 0; i < 10; i++) {
        frequency[i][0] = i;
        }
        // Count frequency
        for (int d : digits) {
        frequency[d][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get input from user
        int number = sc.nextInt();
        int[] digits = storeDigits(number);
        int[][] freq = findDigitFrequency(digits);

        //Display the result
        System.out.print("\nDigits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println("\n\nDigit Count: " + countDigits(number));
        System.out.println("Sum of Digits: " + findSumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + findSumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));
        System.out.println("\nDigit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
            System.out.println(freq[i][0] + "      " + freq[i][1]);
            }
        }


    }
}
