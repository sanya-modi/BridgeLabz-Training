import java.util.*;

public class ReverseString{

    //reverse a given string without using any built-in reverse functions
    public static String reverse(String text){
        String result = "";
        for(int i=text.length()-1; i>=0; i--){
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take user input
        String text = sc.nextLine();
 
        //Display the result
        System.out.println("The reversed string is : " + reverse(text));

    }
}