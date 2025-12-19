import java.util.*;

public class CheckNumber{

        //check whether a number is positive,  negative, or zero.
        public static void check(int num){
         if (num > 0) {
            System.out.println("positive");
        }
        //Display negative if the number is smaller than 0
        else if (num < 0) {
            System.out.println("negative");
        }
        //Otherwise display 0
        else {
            System.out.println("zero");
        }
        }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Define an array of 5 integer elements 
        int num[] = new int[5];

        // take user input for the student's age. 
        for(int i=0; i<num.length; i++){
        num[i] = sc.nextInt();
        check(num[i]);
        }  

        //compare the first and last element of the array
        if(num[0] == num[num.length -1]){
        System.out.println("First and last element are equal"); 
        }
        else if(num[0] > num[num.length -1]){
        System.out.println("First element is greater than last element"); 
        }
        else{
        System.out.println("First element is smaller than last element"); 
        }
        
}
}