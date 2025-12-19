import java.util.Scanner;

public class LargestDigit{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Create a number variable and Take user input.
        int number = sc.nextInt();
        int maxDigit = 10;
        //Define an array to store the digits
        int[] digits = new int[maxDigit];
        int index = 0;

        //Remove the last digit from the number and add it to the array.
        while(number != 0 && index < maxDigit){
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
        int largest = 0;
        int secondLargest = 0;

        //find the largest and second largest number 
        for(int i = 0; i < index; i++){
        if(digits[i] > largest){
        secondLargest = largest;
        largest = digits[i];
        } 
        else if(digits[i] > secondLargest && digits[i] != largest){
        secondLargest = digits[i];
        }
        }

        //display the largest  and second-largest number
        System.out.println("Largest digit is " + largest);
        System.out.println("Second largest digit is " + secondLargest);
    }
}
