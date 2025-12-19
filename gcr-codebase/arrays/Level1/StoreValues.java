import java.util.*;

public class StoreValues{
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Define an array of 10 elements of type double
        double A[] = new double[10];
        //Define a variable to store total sum
        double sum = 0.0;
        //Initialize index variable and user input
        int i =0;
   

        while(true){
        double num = sc.nextDouble();
        if(num <=0 || i==10){ 
        break;
        }
        else{
         A[i] = num;
         i++;
        }
        }

        //display all the numbers as well as the sum of all numbers 
        for(int j=0; j<A.length; j++){
        System.out.println(A[j]);
        sum += A[j];
        }
        System.out.println("Total sum : " + sum);
}
}