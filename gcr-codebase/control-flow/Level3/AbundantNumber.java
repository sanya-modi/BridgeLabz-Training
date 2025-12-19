import java.util.Scanner;

public class AbundantNumber{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get an input from user
        int num = sc.nextInt();
        //Define variables and initialize them
        int sum = 0;
        //check if number is divisible by i
        for(int i=1; i<num; i++){
        if(num%i == 0){
        //sum of all the divisors of the number
        sum += i;
        }
        }
        
        if(sum > num){
        System.out.println("It is an Abundant number");
        }
        else{
        System.out.println("It is not an Abundant number");
        }
}
}