import java.util.*;

public class CountVowelsAndConsonants2{

    //method to check if the character is a vowel or consonant
    public static String checkCharacter(char ch){
        if(ch >='A' && ch<='Z'){
        ch = (char)(ch+32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
            return "Vowel";
            } 
            else {
            return "Consonant";
            }
            } 
            else {
            return "Not a Letter";
            }
    }

    //Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
    public static String[][] checkCharacterType(String text){ 
        String[][] word = new String[text.length()][2];
        for(int i=0; i<text.length(); i++){
        char ch = text.charAt(i);
        word[i][0] = String.valueOf(ch);
        word[i][1] = checkCharacter(ch);
        }
        return word;
    }

    //Display the 2D Array of Strings in a Tabular Format
    public static void display(String[][]word){
        final String lineFormatter = "|------------|--------------|%n";
        final String value = "| %-10s | %-12s |%n"; 
        System.out.printf(lineFormatter);
        System.out.printf(value, "Character", "Type");
        System.out.printf(lineFormatter);
        for(int i=0; i<word.length; i++){ 
        //System.out.printf(lineFormatter); 
        System.out.printf(value, word[i][0], word[i][1]);    
        } 
        System.out.println(lineFormatter);
    }

    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
 
        //Take input from user and call method
        String text = sc.nextLine();
        String[][] str = checkCharacterType(text);

        //Display the result
        display(str);
    }
}
