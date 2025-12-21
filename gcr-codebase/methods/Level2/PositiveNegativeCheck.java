
import java.util.*;
public class PositiveNegativeCheck {

    //check whether the number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    //check whether the number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //compare two num
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
        return 1;
        } else if (number1 == number2) {
        return 0;
        } else {
        return -1;
        }
    }

    // taking user input for 5 num
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter 5 num:");
        for (int i = 0; i < num.length; i++) {
        num[i] = sc.nextInt();
        }
        // Checking each number
        for (int number : num){
        if (isPositive(number)){
        if (isEven(number)){
        System.out.println(number + " positive and even.");
        } 
        else{
        System.out.println(number + " positive and odd.");
        }
        } 
        else{
        System.out.println(number + " negative.");
        }
        }
        // comparing first and last elements
        int comparisonResult = compare(num[0], num[num.length - 1]);
        if(comparisonResult == 1){
        System.out.println("greater than last number.");
        } 
        else if(comparisonResult == 0){
        System.out.println("equal to last number.");
        }else{
        System.out.println("less than last number.");
        }
    }

    }
