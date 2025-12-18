import java.util.Scanner;

public class EmployeeBonus{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Get integer input of salary and year of service
        double salary = sc.nextInt();
        int service = sc.nextInt();
        //Calculate bonus amount
        double bonus = salary * 0.05;

        //Get bonus if year of service is more than 5
        if(service > 5){
        System.out.println("Bonus Amount : " + bonus);
        }
        else{
        System.out.println("Service is less than 5 years");
        }
}
}