import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        //Get integer input
        int number = sc.nextInt();

        int greatestFactor = 1;
 
        //Check for the positive integer
        if (number > 1) {
        int counter = number - 1;
        //Calculate the greatest factor
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor is " + greatestFactor);
        } 
        else {
            System.out.println("The number is not a valid positive integer");
        }
    }
}
