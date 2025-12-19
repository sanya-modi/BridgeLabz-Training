import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get positive integer input
        int num = sc.nextInt();
        Boolean isPrime = true;

        //Prime Numbers checks are done for numbers greater than 1
        if(num > 1){
            for(int i=2; i<num; i++){
            if(num % i == 0){
            isPrime = false;
            //break out from the loop as the number is divisible by some other number
            break;
            }
            }
        
        if(isPrime){
        System.out.println("It is a prime number.");
        }
        else{
       System.out.println("It is not a prime number.");
        }
        } 

        else{
        System.out.println("Invalid input");
        }

}
}