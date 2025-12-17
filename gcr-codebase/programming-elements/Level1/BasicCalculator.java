import java.util.*;

public class BasicCalculator{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        //Calculate Addition of two numbers
        int add = num1 + num2;
        //Calculate Substraction of two numbers
        int substract = num1 - num2;
        //Calculate multiplication of two numbers
        int multiply = num1 * num2;
        //Calculate division of two numbers
        int divide = num1 / num2;
        

        //Print the result of all arithmetic operations
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + add +" " + substract + " " + multiply + " " + divide);

}
}