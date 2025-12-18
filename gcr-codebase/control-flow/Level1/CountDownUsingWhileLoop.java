import java.util.Scanner;

public class CountDownUsingWhileLoop{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get integer input for the countdown
        int counter = sc.nextInt();

        //print the value of the counter
        while(counter>=1){ //check if the counter is 1
        System.out.println(counter);
        //decrement the counter
        counter--;
        }
}
}