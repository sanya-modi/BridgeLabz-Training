import java.util.*;

public class LexicographicalCompare{

    //compare two strings lexicographically (dictionary order) without using built-in compare methods.
    public static String compareWords(String str1, String str2){
        if(str1.equals(str2)) return "Words are same";
        String result = "";
        int n = 0;
        if(str1.length()<str2.length()) n = str1.length();
        else n = str2.length();

        for(int i=0; i<n; i++){
            if(str1.charAt(i) < str2.charAt(i)) result = str1;
            else if (str1.charAt(i) == str2.charAt(i)) continue;
            else result = str2;
        }
        return result;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.println("Enter first string");
        String str1 = sc.next();
        System.out.println("Enter second string");
        String str2 = sc.next();

        //Display the result
        System.out.println("The word comes before is : " + compareWords(str1, str2));

        
    }
}


