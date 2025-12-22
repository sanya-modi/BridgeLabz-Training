import java.util.*;

public class StringToCharArray{

    // method to return the characters in a string without using the toCharArray() 
    public static char[] buildCharArray(String str){
        int n = str.length();
        char[] res = new char[n];
        for(int i=0; i<n; i++){
        res[i] = str.charAt(i);
        }
        return res;
    }  
  
    //Write a method to compare two string arrays
    public static boolean isEqual(char[] arr1, char[] arr2){
        if(arr1.length != arr2.length){
        return false;
        }
        for(int i=0; i<arr1.length; i++){
        if(arr1[i] != arr2[i]){
        return false;
        }
        }
        return true;
    }

    //method to return the characters in a string using the toCharArray()
    public static char[] charArrayUsingInBuildMethod(String str){
        return str.toCharArray();
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take 2 string input 
        String str = sc.next();
        char[] arr1 = buildCharArray(str);
        char[] arr2 = charArrayUsingInBuildMethod(str);

       if(isEqual(arr1 , arr2) ){
       System.out.println("char array are equal and both methods provide same output");
       }
       else{
       System.out.println("char array are not equal");
       }
}
}