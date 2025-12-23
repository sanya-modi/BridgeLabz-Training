import java.util.*;

public class RemoveDuplicate{

   //remove all duplicate characters from a given string and return the modified string
    public static String removeDuplicate(String text){
        //Initialize an array of 256 to store freq to character
        int[] freq = new int[256];
        String result = "";
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(freq[ch] == 0){
            result += ch;
            }
            freq[ch]++;
        }
        return result;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 
        //Enter user input
        System.out.println("Enter a text");
        String text = sc.nextLine();
 
        //Display result
        System.out.println("The modified string without duplicate character is : " + removeDuplicate(text));
    }
}