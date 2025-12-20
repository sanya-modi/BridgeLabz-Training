import java.util.*;

public class SumOfNaturalNumber{

    //Method to find the sum of n natural numbers 
    public static long calculateSum(int n){
        long sum = 0;
        for(int i=1; i<=n; i++){
        sum += i;
        }
    return sum;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //Get integer input from the user
    int n = sc.nextInt();
  
    //Display the output
    System.out.println("Sum of n natural number : " + calculateSum(n));
    }
}