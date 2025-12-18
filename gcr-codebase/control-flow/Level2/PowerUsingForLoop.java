import java.util.Scanner;

public class PowerUsingForLoop{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get integer input for number and power
        int number = sc.nextInt();
        int power = sc.nextInt();
        //Check for positive integer
        int result = 1;
        if(number > 0){
            //Calculate power of a number by multiply the result by the number
            for(int i=1; i<=power; i++){
            result *= number;
            }
            System.out.println("Power of a number : " + result);
        }
        else{
            System.out.println("Invalid input");
        }

}
}