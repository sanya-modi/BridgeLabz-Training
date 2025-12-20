import java.util.*;

public class SimpleInterest{
    
    //method to calculate the simple interest
    public static double calculateSI(double principal, double rate, double time){
    double result = (principal * rate * time) / 100.0;
    return result;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //Take user input for principal, rate, time
    double principal = sc.nextDouble();
    double rate = sc.nextDouble();
    double time = sc.nextDouble();
    
   //Calculated simple interest
   double SI = calculateSI(principal, rate, time);

    //Display the output
    System.out.println("The Simple Interest is " + SI +" for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

    }

}