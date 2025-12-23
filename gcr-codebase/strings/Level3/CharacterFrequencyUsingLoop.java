import java.util.Scanner;

public class CharacterFrequencyUsingLoop {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {
        // Convert string to character array
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        // Initialize frequency array
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
        }
        // Nested loops to count frequency
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }
        // Create result array
        String[] result = new String[count];
        int index = 0;
        // Store character and frequency
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}
