import java.util.Scanner;

public class NumberOfChocolate{

    // find the reminder and the quotient of a number
    public static int[] findRemainderAndQuotient(int number, int children){        
        int result[] = new int[2];
        //divide number by children to find the number of chocolates each child gets
        result[0] = number / children;
        //Use modulo to find the remaining chocolate
        result[1] = number % children;
    return result;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input as integer
        int number = sc.nextInt();
        int children = sc.nextInt();

        //Display the output
        System.out.println("The number of chocolates each child gets is " + findRemainderAndQuotient(number, children)[0] + " and Remaining chocolate is " + findRemainderAndQuotient(number, children)[1]);
    }

}
