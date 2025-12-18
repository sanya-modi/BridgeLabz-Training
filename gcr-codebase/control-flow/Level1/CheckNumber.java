import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Get an integer input to check
        int number = sc.nextInt();

        //Display positive if the number is greater than 0
        if (number > 0) {
            System.out.println("positive");
        }
        //Display negative if the number is smaller than 0
        else if (number < 0) {
            System.out.println("negative");
        }
        //Otherwise display 0
        else {
            System.out.println("zero");
        }
    }
}

