import java.util.*;

public class LargestNumber{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get 3 input values
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        //num1 is largest if both num2 and num3 are smaller 
        Boolean result1 = num1>num2 && num1>num3;
        //num2 is largest if both num1 and num3 are smaller 
        Boolean result2 = num2>num1 && num2>num3;
        //num3 is largest if both num1 and num2 are smaller 
        Boolean result3 = num3>num1 && num3>num2;

        //Display the result as true for the largest number, otherwise false
        System.out.println("Is the first number the largest? " + result1);
        System.out.println("Is the second number the largest? " + result2);
        System.out.println("Is the third number the largest? " + result3);
}
}