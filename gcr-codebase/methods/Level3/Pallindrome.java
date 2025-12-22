import java.util.Scanner;

public class Pallindrome{

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

    // Method to reverse digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        int j = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
        reversed[j++] = digits[i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
        return false;
        }
        }
        return true;
    }

    // Method to check palindrome using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check Duck Number (contains zero, not leading)
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
        if (digits[i] == 0) {
        return true;
        }
        }
        return false;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get an input from user
        int number = sc.nextInt();
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);

        System.out.print("\nDigits: ");
        for (int d : digits) {
        System.out.print(d + " ");
        }
        System.out.print("\nReversed Digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println("\n\nDigit Count: " + countDigits(number));
        System.out.println("Arrays Equal: " + areArraysEqual(digits, reversed));
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

    }
}
