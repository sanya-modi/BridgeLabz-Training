import java.util.*;

public class NumberFormatException{
 
    //Method to demonstrate NumberFormatException
    public static int checkException(String text){
        return Integer.parseInt(text);
    }

    //
    public static void handleException(String text){
    try{
    System.out.println(Integer.parseInt(text));
    }
    catch(Exception e){ 
    System.out.println(" Exception occured : NumberFormatException \n" + e.getMessage());
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