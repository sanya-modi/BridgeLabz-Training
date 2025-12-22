import java.util.*;

public class StringIndexOutOfBoundsException{
 
    //Method to demonstrate NullPointerException
    public static char checkException(String text){
        return text.charAt(text.length());
    }

    //
    public static void handleException(String text){
    try{
    System.out.println(text.charAt(text.length()));
    }
    catch(Exception e){ 
    System.out.println(" Exception occured : StringIndexOutOfBoundsException \n" + e.getMessage());
    }
    }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  
    //Get input by user
    String text = "Sanya";    
  
    try{
    checkException(text);
    }
    catch(Exception e){ 
    System.out.println("Exception caught in main");
    }
    handleException(text);
    }
}