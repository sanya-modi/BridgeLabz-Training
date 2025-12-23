import java.util.Scanner;

public class Palindrome{

    // Logic 1 
    // Compare characters from start and end using loop
    public static boolean isPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2 
    // Recursive method to compare characters
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Logic 3 
    // Reverse string using charAt()
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reverse = new char[len];

        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }
        return reverse;
    }

    // Palindrome check using character arrays
    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Loop Logic      : " + isPalindromeUsingLoop(text));
        System.out.println("Using Recursion Logic : " +
                isPalindromeUsingRecursion(text, 0, text.length() - 1));
        System.out.println("Using Array Logic     : " + isPalindromeUsingArray(text));

        sc.close();
    }
}
