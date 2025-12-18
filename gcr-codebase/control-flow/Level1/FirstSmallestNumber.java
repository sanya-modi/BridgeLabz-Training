import java.util.*;

public class FirstSmallestNumber{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get input values for 3 numbers
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        //num1 is smallest if both num2 and num3 are greater than it
        Boolean result = num1<num2 && num1<num3;

        //Display true if first number is smallest, otherwise false
        System.out.println("Is the first number the smallest? " + result);
 
}
}