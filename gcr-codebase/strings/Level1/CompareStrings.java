import java.util.*;

public class CompareStrings{

    //method to compare two strings using the charAt() method
    public static boolean isEqualUsingUserMethod(String str1, String str2){
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
        return false;
    }  

    //String Built-In method to compare two strings
    public static boolean isEqualUsingInBuildMethod(String str1, String str2){
        return str1.equals(str2);
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take 2 string input 
        String str1 = sc.next();
        String str2 = sc.next(); 

        boolean result1 = isEqualUsingUserMethod(str1, str2);
        boolean result2 = isEqualUsingInBuildMethod(str1, str2);
 
        //Display result 
        if(result1 && result2){ 
        System.out.println("Results are same and both methods give same output");
        }
        else{
         System.out.println("Results are not same");
        }

}
}