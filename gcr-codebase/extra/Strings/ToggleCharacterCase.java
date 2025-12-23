import java.util.*;

public class ToggleCharacterCase{

    //Convert uppercase letters to lowercase and vice versa.
    public static String convertCharacterCase(String text){
         String result = "";
         for(char ch : text.toCharArray()){
         if(ch>='a' && ch<='z') result+=(char)(ch-32);
         else if(ch>='A' && ch<='Z') result+=(char)(ch+32);
         else result+=ch;
         }
         return result;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.println("Enter a text : ");
        String text = sc.nextLine();

        //Display result
        System.out.println("The toggled string is : " + convertCharacterCase(text));
    }
}