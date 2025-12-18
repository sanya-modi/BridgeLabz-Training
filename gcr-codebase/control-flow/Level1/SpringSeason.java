import java.util.Scanner;

public class SpringSeason{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //Get integer input for day and month
    System.out.println("Enter the month number : ");
    int month = sc.nextInt();
    System.out.println("Enter the day number : ");
    int day = sc.nextInt();

    //Check the day and month, as spring Season is from March 20 to June 20
     if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } 
        else {
            System.out.println("Not a Spring Season");
        }
}
}