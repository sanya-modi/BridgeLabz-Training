import java.util.*;

public class TextToWords{

    //Method to find the length of the String without using the built-in length() method. 
    public static int calculateLength(String str){
         int count = 0;
         for (char ch : str.toCharArray()) {
         count++;
         }
         return count;       
    }

    //Method to split the text into words using the charAt() method
    public static String[] customSplit(String text) {
        int length = calculateLength(text);
        int wordCount = 1;
        // Count words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        // Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int index = 0;
        spaceIndex[index++] = -1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }
        spaceIndex[index] = length;
        // Extract words using indexes
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
  
        //Take user input
        String text = sc.nextLine();
        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");
        boolean result = compareArrays(customWords, builtInWords);

        System.out.println("\nWords using custom split:");
        for (String w : customWords) {
            System.out.println(w);
        }
        System.out.println("\nWords using built-in split():");
        for (String w : builtInWords) {
            System.out.println(w);
        }
        System.out.println("\nAre both results equal? " + result);

    }
}