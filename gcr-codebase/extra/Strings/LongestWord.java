import java.util.*;

public class LongestWord{

     //find the longest word in the string
     public static String findLongestWord(String text){
        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } 
            else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        // Check last word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }
        return longestWord;
     }

     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    
         //Take user input 
         System.out.println("Enter the text : ");
         String sentence = sc.nextLine();
         //Call the method
         String longest = findLongestWord(sentence);

         //Display the result
         System.out.println("Longest word: " + longest);

     }

}