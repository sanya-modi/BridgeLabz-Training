import java.util.*;

public class ConvertToLowerCase{

    //Write a method using the String built-in charAt() 
    public static String convertUsingCharAt(String text){
        String res = "";
        int n = text.length();
        for(int i=0; i<n; i++){
            if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
            char ch = text.charAt(i);
            res += (char)(ch+32);
            }
            else{
            res += text.charAt(i);
            }
        }
    return res;
    }

    //Write a method to compare two strings using the charAt() method
    public static boolean compareStrings(String str1, String str2){
        if(str1.length() != str2.length()){
        return false;
        }
        for(int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i) != str2.charAt(j)){
                return false;
                }
            }
        }
        return true;
    } 

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
        //Take user input
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

        text1 = convertUsingCharAt(text1);
        text2 = text2.toLowerCase();


        System.out.println(text1);
        System.out.println(text2);
        if(compareStrings(text1, text2)){
        System.out.println("Both strings are equal");
        }
        else{
        System.out.println("Both strings are not equal");
        }

    }
}