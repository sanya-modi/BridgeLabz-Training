import java.util.Scanner;

public class FactorsUsingWhileLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get input from user
        int number = sc.nextInt();

        //Check if input is a positive integer
        if (number > 0) {
        int counter = 1;
        //Calculate factors of the number
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                    counter++; 
                }
            }
        } 
        else {
            System.out.println("The number is not a positive integer");
        }
    }
}
