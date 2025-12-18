import java.util.Scanner;

public class CountDownUsingForLoop{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get integer input for the countdown
        int counter = sc.nextInt();

        //print the value of the counter
        for(int i=counter; i>=1; i--){ 
        System.out.println(i);
        }
}
}