import java.util.Scanner;

public class LargestTwoDigits{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get an input
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int largest = 0;
        int secondLargest = 0;
        while (number != 0) {
        if (index == maxDigit) {
        maxDigit = maxDigit + 10;
        int[] temp = new int[maxDigit];
        for (int i = 0; i < index; i++) {
        temp[i] = digits[i];
        }
        digits = temp;
        }
        digits[index] = number % 10;
        number = number / 10;
        index++;
        }
        //find the largest and second largest number
        for (int i = 0; i < index; i++) {
        if (digits[i] > largest) {
        secondLargest = largest;
        largest = digits[i];
        } 
        else if(digits[i]> secondLargest && digits[i] != largest){
        secondLargest = digits[i];
        }
        }

        //display the largest and second largest number  
        System.out.println("Largest digit is " + largest);
        System.out.println("Second largest digit is " + secondLargest);
    }
}

