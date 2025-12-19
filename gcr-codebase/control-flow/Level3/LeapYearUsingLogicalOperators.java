import java.util.Scanner;

public class LeapYearUsingLogicalOperators{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get integer input as year
        int year = sc.nextInt();
    
        //The LeapYear only works for year >= 1582
        if(year >= 1582){
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
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
}