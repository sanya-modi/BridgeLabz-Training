/*
Temperature Logger 
Record temperatures over 7 days.
- Use array and for-loop.
- Find average and max temperature.
- Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

public class TemperatureLogger {
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// create an array temperature
	double[] temperature = new double[7];
	//Initialize variables
        double sum = 0.0;
        double maxTemperature = 0.0;

        //Take input from user using for-loop
        for(int i=0;i<temperature.length;i++){
        	System.out.println("Enter temperature in celsius on day "+ (i+1) + " : ");
        	temperature[i] = input.nextDouble();
		// Compare temperature to find maximum temp
        	if(temperature[i]>maxTemperature){
        		maxTemperature=temperature[i];
        	}
		//Update sum to calculate total temperature
		sum += temperature[i];
        }
        double averageTemp = sum/7;

	//Display the result
        System.out.printf("Average temperature over 7 days is : %.2f%n", averageTemp);
        System.out.println("Maximum temperature over 7 days is : "+maxTemperature);

	}
	
}