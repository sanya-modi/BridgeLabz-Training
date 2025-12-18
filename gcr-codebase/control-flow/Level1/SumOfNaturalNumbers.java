import java.util.*;

public class SumOfNaturalNumbers{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get an input and check if it is an natural number
        int n = sc.nextInt();
        // If a number is negative or 0, it is not a natural number
        if(n<=0){
        System.out.println("The number " + n + " is not a natural number");
        return;
        }

        //Calculate sum of n natural numbers using loop
        long sum = 0;
        for(int i=1; i<=n; i++){
        sum += i;
        }
        //Display the sum 
        System.out.println("The sum of " + n + " natural numbers is " + sum);
        
}
}