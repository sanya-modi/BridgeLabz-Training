import java.util.*;

public class CountVowelsAndConsonants{

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

    //count of vowels, consonants and not a letter 
    public static void countCharacter(String text){
        int vowel = 0;
        int consonant = 0;
        int notALetter = 0;
        for(int i=0; i<text.length(); i++){
        char ch = text.charAt(i);
        String str = checkCharacter(ch);
        if (str.equals("Vowel")) {
                vowel++;
            } 
            else if (str.equals("Consonant")) {
                consonant++;
            }  
            else {
                notALetter++;
            }
        }
        System.out.printf("Length of vowels : %d %n Length of consonants : %d %n Length of special character : %d", vowel, consonant, notALetter);
    }

    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
 
        //Take input from user
        String text = sc.nextLine();
        
        //Display the result
        countCharacter(text);
    }
}
