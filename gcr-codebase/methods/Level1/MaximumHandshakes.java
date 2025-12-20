import java.util.*;

public class MaximumHandshakes{

    public static int calculateHandshakes(int students){
    //formula to calculate the maximum number of possible handshakes
    int result = (students*(students-1))/2;
    return result;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //Get integer input for the numberOfStudents
    int students = sc.nextInt();
    
    //Display the number of possible handshakes.
    System.out.println("The number of possible handshakes : " + calculateHandshakes(students));

    }
}