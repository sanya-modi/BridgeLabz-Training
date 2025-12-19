import java.util.*;

public class VoteEligibility{

        //check whether the student can vote depending on his/her age is greater or equal to 18.
        public static Boolean checkEligibility(int age){
        if(age>=18){
        return true;
        }
        return false;
        }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Define an array of 10 integer elements 
        int age[] = new int[10];

        // take user input for the student's age. 
        for(int i=0; i<age.length; i++){
        age[i] = sc.nextInt();
        if(age[i] > 0){
        if(checkEligibility(age[i])){
        System.out.println("The person's age is " + age[i] + " and can vote.");
    } 
        else{
        System.out.println("The person's age is " + age[i] + " and cannot vote.");
    } 
        }
        else{
        System.out.println("Invalid age");  
        }
        }  
}
}