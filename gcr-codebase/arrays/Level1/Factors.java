import java.util.Scanner;

public class Factors{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take the input for a number
        int number = sc.nextInt();
        // create integer variable maxFactor and initialize to 10
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        //index variable to reflect the index of the array. 
        int index = 0;

        if (number > 0) {
        for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
        if (index == maxFactor) {
        maxFactor = maxFactor * 2;
        int[] temp = new int[maxFactor];
        for (int j = 0; j < index; j++) {
        temp[j] = factors[j];
        }
        factors = temp;
        }
        factors[index] = i;
        index++;
        }
        }

        // Display the factors of the number
        for (int i = 0; i < index; i++) {
        System.out.println(factors[i]);
        }
        } 
        else {
        System.out.println("Invalid input");
        }
}
}
