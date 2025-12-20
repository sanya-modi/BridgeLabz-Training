import java.util.Scanner;

public class LeapYear{

    //Check for Loop Year
    public static void checkLeapYear(int year){
        //The LeapYear only works for year >= 1582
        if(year >= 1582){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
        System.out.println("Year is a Leap Year");
        } 
        else {
        System.out.println("Year is not a Leap Year");
        }
        }
        else{
        System.out.println("Invalid Year");
        }
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get integer input as year
        int year = sc.nextInt();
     
        //Calling method to display the result
        checkLeapYear(year);
   
    }
}