import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take input for a number
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        //Find the count of digits
        while (temp != 0) {
        count++;
        temp /= 10;
        }
        //Array to store digits
        int[] digits = new int[count];
        int index = 0;
        //Store digits in array
        while (number != 0) {
        digits[index++] = number % 10;
        number /= 10;
        }
        //Frequency array for digits 0 to 9
        int[] frequency = new int[10];
        //Calculate frequency of each digit
        for (int i = 0; i < count; i++) {
        frequency[digits[i]]++;
        }
        //Display frequency
        for (int i = 0; i < 10; i++) {
        if (frequency[i] > 0) {
        System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
        }
        }

    }
}
