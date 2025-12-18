import java.util.*;

public class VoteEligibility{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //Get integer input
    int age = sc.nextInt();

    //A person can vote if their age is greater or equal to 18
    if(age>=18){
    System.out.println("The person's age is " + age + " and can vote.");
    } 
    else{
    System.out.println("The person's age is " + age + " and cannot vote.");
    } 
}
}