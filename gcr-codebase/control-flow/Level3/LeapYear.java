import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get integer input as year
        int year = sc.nextInt();
    
        //The LeapYear only works for year >= 1582
        if(year >= 1582){
            if (year % 400 == 0) {
                System.out.println("It is a Leap Year");
            } 
            else if (year % 100 == 0) {
                System.out.println("It is not a Leap Year");
            } 
            else if (year % 4 == 0) {
                System.out.println("It is a Leap Year");
            } 
            else {
                System.out.println("It is not a Leap Year");
            }

        }
        else{
        System.out.println("Invalid Year");
        }
}
}