import java.util.*;

public class ArrayIndexOutOfBoundsException{
 
    //Method to demonstrate ArrayIndexOutOfBoundException
    public static String checkException(String[] names){
        return names[names.length];
    }

    //
    public static void handleException(String[] names){
    try{
    System.out.println(names[names.length]);
    }
    catch(Exception e){ 
    System.out.println(" Exception occured : ArrayIndexOutOfBoundsException \n" + e.getMessage());
    }
    }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  
    //Get input by user
    String[] names = {"Sanya", "Akash", "Vishal"};    
  
    try{
    checkException(names);
    }
    catch(Exception e){ 
    System.out.println("Exception caught in main");
    }
    handleException(names);
    }
}