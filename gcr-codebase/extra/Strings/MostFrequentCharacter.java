import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find most frequent character
    public static char findMostFrequentChar(String text) {
        int[] freq = new int[256]; 
        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        // Find character with maximum frequency
        int max = 0;
        char result = '\0';
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get user input
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        //call method
        char mostFrequent = findMostFrequentChar(text);

        //Display the result
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        sc.close();
    }
}
