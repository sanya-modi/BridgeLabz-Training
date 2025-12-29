import java.util.*;

public class ParkingSystem{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

	//Total parking capacity
        final int totalSpace = 10;
	//Count number of vehicle parks
	int count = 0;

	while(totalSpace >= count){
	System.out.println("Enter your choice : park, exit, show-occupancy ");
	String input = sc.next().trim().toLowerCase();

	//Select option using switch
        switch(input){
        case "park" :
             System.out.println("Your vehicle is parked");
	     count++;
             break;
        case "exit" :
	     System.out.println("Thanks for visiting");
             return;
        case "show-occupancy" : 
             System.out.println("Total Capacity : " + totalSpace);
             System.out.println("Total parked vehicle : " + count);
             break;
        default :
             System.out.println("Invalid input, please try again");
             continue;
	}
	}
	sc.close();
    }
}