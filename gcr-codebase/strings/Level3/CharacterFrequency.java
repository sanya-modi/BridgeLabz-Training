import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters and return 2D array
    public static char[][] findFrequency(String text) {

        //Frequency array for ASCII characters
        int[] freq = new int[256];

        //Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        //Count unique characters
        int uniqueCount = 0;
        boolean[] visited = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                uniqueCount++;
            }
        }

        //Create 2D array [character, frequency]
        char[][] result = new char[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (visited[ch]) {
                result[index][0] = ch;
                result[index][1] = (char) freq[ch]; // storing frequency
                visited[ch] = false; // mark stored
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[][] frequency = findFrequency(text);

        System.out.println("\nCharacter  Frequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("    " + frequency[i][0] + "          " + (int) frequency[i][1]);
        }

        sc.close();
    }
}
