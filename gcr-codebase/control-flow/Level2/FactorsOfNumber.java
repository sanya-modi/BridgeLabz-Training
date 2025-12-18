import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get input from user
        int number = sc.nextInt();

        //Check if input is a positive integer
        if (number > 0) {
        //Calculate factors of the number
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } 
        else {
            System.out.println("The number is not a positive integer");
        }
    }
}
