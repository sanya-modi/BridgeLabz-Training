import java.util.Scanner;

public class QuotientAndRemainder{

    // find the reminder and the quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor){        
        int result[] = new int[2];
        //divide number by divisor to find the quotient
        result[0] = number / divisor;
        //Use modulo to find the remainder
        result[1] = number % divisor;
    return result;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input as integer
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        //Display the output
        System.out.println("The Quotient is " + findRemainderAndQuotient(number, divisor)[0] + " and Reminder is " + findRemainderAndQuotient(number, divisor)[1] + " of two number " + number + " and " + divisor);
    }

}
