import java.util.*;

public class SmallestAndLargestNumber{

    //find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int num1, int num2, int num3){
        int[] result = new int[2];
        
        //Conditions to find largest
        if(num1>num2 && num1>num3){
        result[0] = num1;
        }
        else if(num2>num1 && num2>num3){
        result[0] = num2;
        }
        else{
        result[0] = num3;
        }

        //Conditions to find smallest
        if(num1<num2 && num1<num3){
        result[1] = num1;
        }
        else if(num2<num1 && num2<num3){
        result[1] = num2;
        }
        else{
        result[1] = num3;
        }

    return result;

    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take user input for 3 numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt(); 

        //Display the result
        System.out.println("The largest number : " + findSmallestAndLargest(num1, num2, num3)[0] +" and the smallest number : " + findSmallestAndLargest(num1, num2, num3)[1] );   

    }
}
