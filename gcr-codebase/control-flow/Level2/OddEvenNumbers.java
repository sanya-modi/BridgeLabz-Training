import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Check if the infut is a natural number
        if (n >= 1) {
        //iterating to find even and odd number between 1 to n
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } 
        else {
            System.out.println("The number is not a natural number");
        }
    }
}
