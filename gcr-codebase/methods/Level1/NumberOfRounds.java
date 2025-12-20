import java.util.Scanner;

public class NumberOfRounds{
 
    //Calculate number of rounds
    public static int calculateRounds(int perimeter){
    //Initialize total distance to complete by an athlete
    int totalDist = 5000;
    
    int result = totalDist/perimeter;
    return result;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //Display the number of possible handshakes.
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    //Calculate perimeter of triangle
    int perimeter = a+b+c;

    //Display the number of rounds    
    System.out.println("The total number of rounds user needs to do to complete 5km run : " + calculateRounds(perimeter) );
    }
}