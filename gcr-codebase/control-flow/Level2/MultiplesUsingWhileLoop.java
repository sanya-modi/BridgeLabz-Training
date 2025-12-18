import java.util.Scanner;

public class MultiplesUsingWhileLoop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
        //Get integer input 
        int number = sc.nextInt();

        //Check the number is a positive integer and less than 100
        if (number > 0 && number < 100) {
        int counter = 100;
            while(counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } 
        else {
            System.out.println("Invalid input");
       
 }
}
}
