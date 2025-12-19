import java.util.*;

public class ArmstrongNumber{
  
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get a positive integer input
        int num = sc.nextInt();
        //Define variables and initialize them
        int sum = 0;
        int originalNum = num;

        while(originalNum > 0){
            int lastDigit = originalNum % 10;
            sum += Math.pow(lastDigit, 3);
            originalNum /= 10;
        } 

        //check if the number and the sum are the same
        if(sum == num){
        System.out.println("It is an Armstrong number");
        }
        else{
        System.out.println("It is not an Armstrong number");
        }
}
}