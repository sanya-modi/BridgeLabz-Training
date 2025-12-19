import java.util.*;

public class FizzBuzz{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
        //Get input from user 
        int num = sc.nextInt();
        //Define a String array to save result
        String result[] = new String[num];

        //Check for positive integer
        if (num > 0) {
        for (int i = 1; i <= num; i++) {
        //If the number is multiple of both 3 and 5
        if (i % 3 == 0 && i % 5 == 0) {
        result[i-1] = "FizzBuzz";
        }
        //If the number is multiple of both 3
        else if (i % 3 == 0) {
        result[i-1] = "Fizz";
        } 
        //If the number is multiple of both 5
        else if (i % 5 == 0) {
        result[i-1] = "Buzz";
        } 
        //If the number is not a multiple of 3 or 5
        else {
        result[i-1] = "" + i;
        }
        }
        } 
        else{
        System.out.println("The number is not a positive integer");
        }

        //Display the result  of the array
        for(int i=0; i<result.length; i++){
        System.out.println(result[i]);
        }

}
}
