import java.util.Scanner;

public class Anagram{

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {
        //If lengths are not equal, not anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        //Frequency arrays for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        //Count frequency of characters
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        //Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        //Display result
        if (isAnagram(str1, str2)) {
            System.out.println("The strings are ANAGRAMS");
        } else {
            System.out.println("The strings are NOT anagrams");
        }

        sc.close();
    }
}
