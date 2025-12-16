import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal:");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate:");
        double rate = sc.nextDouble();
        System.out.println("Enter Time:");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}