import java.util.*;

public class SumOfNumbers{

    //sum of n natural numbers using recursion
    public static long sumUsingRecursion(int n){
       //Base Condition
        if(n==1){
        return 1;
        }
    return n + sumUsingRecursion(n - 1);
    }

    //the sum of n natural numbers using formula
    public static long sumUsingFormula(int n){
        long sum = (n*(n+1))/2;
    return sum;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take the user input number
        int n = sc.nextInt();
        //check whether it's a Natural number
        if(n>0){
        System.out.println("Sum of n natural numbers using recursion : " + sumUsingRecursion(n));
        System.out.println("Sum of n natural numbers using formula : " + sumUsingFormula(n));
        System.out.println("The result from both computations is correct. : " + (sumUsingRecursion(n)==sumUsingFormula(n)));
        }
        else{
        System.out.println("Not a natural number");
        }
    }
}