import java.util.*;

public class IllegalArgumentException{
 
    //Method to demonstrate IllegalArgumentException
    public static String checkException(String text){
        return text.substring(4, 2);
    }

    //
    public static void handleException(String text){
    try{
    System.out.println(text.substring(4, 2));
    }
    catch(Exception e){ 
    System.out.println(" Exception occured : IllegalArgumentException \n" + e.getMessage());
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