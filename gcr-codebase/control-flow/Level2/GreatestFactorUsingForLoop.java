import java.util.Scanner;

public class GreatestFactorUsingForLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        //Get integer input
        int number = sc.nextInt();

        int greatestFactor = 1;
 
        //Check for the positive integer
        if (number > 1) {
        //Calculate the greatest factor
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("The greatest factor is " + greatestFactor);
        } 
        else {
            System.out.println("The number is not a valid positive integer");
        }
    }
}
