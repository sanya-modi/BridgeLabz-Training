import java.util.Scanner;

public class SumOfNumbers{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

	//Get double input
    	double n = sc.nextDouble();
   	//initialize total as 0
    	double total = 0.0;
        //Add the input to the total until it's value is 0
    	while(n!=0.0){ 
    	  total += n;
          n = sc.nextDouble();
    	}
    
  
     	System.out.println("The total sum is " + total);   
} 
}