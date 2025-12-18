import java.util.Scanner;

public class FizzBuzzUsingForLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        //Get input from user 
        int number = sc.nextInt();

        //Check for positive integer
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                else {
                    System.out.println(i);
                }
            }
        } 
        else {
            System.out.println("The number is not a positive integer");
        }

}
}
