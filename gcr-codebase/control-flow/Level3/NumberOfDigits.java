import java.util.*;

public class NumberOfDigits{
  
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get a positive integer input
        int num = sc.nextInt();
        //Define variable and initialize them
        int count = 0;

        //iterate until number is not equal to 0.
        while(num > 0){
            count++;
            num /= 10;
        } 

        //check if the number and the sum are the same
        System.out.println("The number of digits : " + count);
       
}
}