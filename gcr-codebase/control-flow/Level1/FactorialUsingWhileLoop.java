import java.util.Scanner;

public class FactorialUsingWhileLoop{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get an integer input
        int n = sc.nextInt();

        //Check if the input is positive
        if(n>0){
        int factorial = 1;
        int i =1;
        //Multiply numbers from 1 to n, to calculate the factorial
        while(i<=n){ 
        factorial *= i;
        //Increment the value
        i++;     
        }

        //Display the factorial of the number
        System.out.println("Factorial of " + n + " is : " + factorial);
        }
        else{
        System.out.println("The number " + n +" is negative");
        }
}
}