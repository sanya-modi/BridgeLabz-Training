import java.util.*;

public class TextToWordsUsing2D{

    //Method to find the length of the String without using the built-in length() method. 
    public static int calculateLength(String str){
         int count = 0;
         for (char ch : str.toCharArray()) {
         count++;
         }
         return count;       
    }

    //Method to split the text into words using the charAt() method
    public static String[][] customSplit(String text) {
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
        String[][] words = new String[wordCount][2];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i][0] = word;
            words[i][1] = String.valueOf(calculateLength(word));
        }
        return words;
    }

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
  
        //Take user input
        String text = sc.nextLine();
        String[][] customWords = customSplit(text);
        int n = customWords.length;

        System.out.println("\nWords using custom split:");
        System.out.println("Words    Length");
        for (int i=0; i<n; i++){
            
                System.out.println(customWords[i][0] + "         " + customWords[i][1]);
            
        }

    }
}