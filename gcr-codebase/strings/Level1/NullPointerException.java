import java.util.*;

public class NullPointerException{
 
    //Method to demonstrate NullPointerException
    public static char checkException(){
        String text = null;
        return text.charAt(1);
    }

    //
    public static void handleException(){
    try{
    String text = null;
    System.out.println(text.charAt(1));
    }
    catch(Exception e){ 
    System.out.println(" Exception occured : NullPointerException" + e.getMessage());
    }
    }
    
    public static void main(String[] args){
    try{
    checkException();
    }
    catch(Exception e){ 
    handleException();
    }
    }
}