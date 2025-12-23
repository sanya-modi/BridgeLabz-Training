import java.util.*;

public class Palindrome{

    //check if a given string is a palindrome
    public static Boolean checkPalindrome(String text){
        int start = 0;
        int end = text.length() - 1;
        while (start < end){
            if (text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take input user 
        System.out.print("Enter text: ");
        String text = sc.nextLine();
 
        //Display the result
        if(checkPalindrome(text)){
        System.out.println("The string is palindrome");
        }
        else{
        System.out.println("The string is not palindrome");
        }
    }
}