import java.util.*;

public class LengthOfString{

    //method to find and return a string's length without using the built-in length()
    public static int calculateLength(String str){
        int count = 0;
        int index = 0;
        try{
        while(true){
        str.charAt(index++);
        count++;
        }
        }
        catch(Exception e){
        return count;
        }
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //Take user input
    String str = sc.next();
    int len1 = calculateLength(str); 
    int len2 = str.length();

    if(len1 == len2){
    System.out.println("Result are equal and length of string is : " + len1);
    } 
    else {
    System.out.println("Lengths are NOT equal");
        }
 
    }
}