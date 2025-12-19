import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take user input for a number. 
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        //Find the count of digits in the number. 
        while (temp != 0) {
        count++;
        temp /= 10;
        }
        int[] digits = new int[count];
        int[] reversed = new int[count];
        int index = 0;
        //Find the digits in the number and save them in an array
        while (number != 0) {
        digits[index++] = number % 10;
        number /= 10;
        }
        //store the elements of the digits array in reverse order
        for (int i = 0; i < count; i++) {
        reversed[i] = digits[i];
        }

        //display the elements of the array in reverse order
        for (int i = 0; i < count; i++) {
        System.out.print(reversed[i]);
        }
    }
}
