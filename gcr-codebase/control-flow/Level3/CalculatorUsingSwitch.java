import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get input from user
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();

        switch (op) {
            case "+":
            System.out.println("Result: " + (first + second));
            break;
            case "-":
            System.out.println("Result: " + (first - second));
            break;
            case "*":
            System.out.println("Result: " + (first * second));
            break;
            case "/":
            System.out.println("Result: " + (first / second));
            break;
            default:
            System.out.println("Invalid Operator");
        }
}
}
