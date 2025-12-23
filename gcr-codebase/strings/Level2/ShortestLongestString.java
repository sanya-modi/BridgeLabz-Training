import java.util.*;

public class ShortestLongestString{

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
    
    //Method to find shortest and longest string 
    public static String[] findLongestAndShortestString(String[][] words){
        int longest = Integer.MIN_VALUE;
        int shortest = Integer.MAX_VALUE;
        String shortWord = "";
        String longWord = "";

    	for(int i=0; i<words.length; i++){
            int len = Integer.parseInt(words[i][1]);
            //longest string
            if(len > longest){
            longest = len;
            longWord = words[i][0];
            }
            //shortest string
            if(len < shortest){
            shortest = len;
            shortWord = words[i][0];
            }
    	}
    	return new String[]{longWord, shortWord};
    }

    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
  
        //Take user input and call methods
        String text = sc.nextLine();
        String[][] customWords = customSplit(text);
        int n = customWords.length;
        String[] word = findLongestAndShortestString(customWords);

        System.out.println("\nWords using custom split:");
        System.out.println("Words    Length");
        for (int i=0; i<n; i++){
            System.out.println(customWords[i][0] + "         " + customWords[i][1]);  
        }
        System.out.println("Longest word : " + word[0]);
        System.out.println("Shortest word : " + word[1]);

    }
}