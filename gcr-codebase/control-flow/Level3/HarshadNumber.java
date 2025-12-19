import java.util.*;

public class HarshadNumber{
  
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get a positive integer input
        int num = sc.nextInt();
        //Define variables and initialize them
        int sum = 0;
        int originalNum = num;

        while(originalNum > 0){
            int lastDigit = originalNum % 10;
            sum += lastDigit;
            originalNum /= 10;
        } 

        //check if the number and the sum are the same
        if(num%sum == 0){
        System.out.println("It is a Harshad number");
        }
        else{
        System.out.println("It is not a Harshad number");
        }
}
}