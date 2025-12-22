import java.util.*;

public class SubStrings{

    //method to create a substring from a string using the charAt()
    public static String substringUsingCharAtMethod(String str, int start, int end){
        String res = "";
        for(int i=start; i<end; i++){
            res += str.charAt(i);
        }
        return res;
    }  

    //String Built-In method to create substring
    public static String substringUsingInBuildMethod(String str, int start, int end){
        return str.substring(start, end);
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take 2 string input 
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String substr1 = substringUsingCharAtMethod(str, start, end);
        String substr2 = substringUsingInBuildMethod(str, start, end);

       if(substr1.equals(substr2) ){
       System.out.println("Substring are equal and both methods provide same output");
       }
       else{
       System.out.println("Substring are not equal");
       }
}
}