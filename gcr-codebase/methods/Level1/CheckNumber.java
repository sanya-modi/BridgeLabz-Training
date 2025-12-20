import java.util.Scanner;

public class CheckNumber {
 
     //check whether a number is positive, negative, or zero.
     public static int check(int number){
        // positive if the number is greater than 0
        if (number > 0) {
            return 1;
        }
        // negative if the number is smaller than 0
        else if (number < 0) {
            return -1;
        }
        //Otherwise  0
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            //Get an integer input to check
            int number = sc.nextInt();

            //Display the output
            System.out.println(check(number));
    }
}

