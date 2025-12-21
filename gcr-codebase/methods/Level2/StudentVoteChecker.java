import java.util.*;

public class StudentVoteChecker{

    //Check whether the student can vote
    public static boolean canStudentVote(int age){
        if(age>=18){
        return true;
        }
        return false;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Define array of 10 integer elements
        int[] age = new int[10];
        //loop through the array by take user input for the student's age
        for(int i=0; i<10; i++){
        age[i] = sc.nextInt();
        if(age[i] > 0){
        if(canStudentVote(age[i])){
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