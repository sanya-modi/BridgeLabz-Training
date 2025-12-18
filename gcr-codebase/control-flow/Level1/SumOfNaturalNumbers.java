import java.util.*;

public class SumOfNaturalNumbers{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get an integer input 
        int n = sc.nextInt();
        //Calculate sum of n natural numbers using loop
        long sum = 0;
        for(int i=1; i<=n; i++){
        sum += i;
        }

        //Display the sum 
        System.out.println("The sum of " + n + " natural numbers is " + sum);
        
}
}