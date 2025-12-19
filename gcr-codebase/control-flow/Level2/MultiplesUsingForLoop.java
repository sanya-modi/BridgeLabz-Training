import java.util.Scanner;

public class MultiplesUsingForLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
        //Get integer input 
        int number = sc.nextInt();

        //Check the number is a positive integer and less than 100
        if (number > 0 && number < 100) {
        for (int i = 100; i >= 1; i--) {
        if (i % number == 0) {
        System.out.println(i);
        }
        }
        } 
        else {
        System.out.println("Invalid input");      
        }
}
}
