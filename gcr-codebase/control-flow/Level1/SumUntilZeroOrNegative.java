import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

       //Infinite loop to always execute, until it gets terminated
        while (true) {
            double n = sc.nextDouble();
            //Terminate the loop if input value is negative or 0
            if (n <= 0) {
                break;
            }
            //Add input value to total
            total += n;
        }
 
        //Display the total value unit the input is negative or 0
        System.out.println("The total sum is " + total);
    }
}
