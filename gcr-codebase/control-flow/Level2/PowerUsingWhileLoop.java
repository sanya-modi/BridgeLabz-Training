import java.util.Scanner;

public class PowerUsingWhileLoop{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get integer input for number and power
        int number = sc.nextInt();
        int power = sc.nextInt();
        //Check for positive integer
        int result = 1;
        if(number > 0){
            //Calculate power of a number by multiply the result by the number
            int counter = 0;
            while(counter < power){
            result *= number;
            counter++;
            }
            System.out.println("Power of a number : " + result);
        }
        else{
            System.out.println("Invalid input");
        }

}
}