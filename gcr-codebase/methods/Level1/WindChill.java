import java.util.*;

public class WindChill{
    
    //
    public static double calculateWindChill(double temp, double windSpeed){
       double windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16); 
    return windChill;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take user input for temperature and wind speed
        double temp = sc.nextDouble();
        double windSpeed = sc.nextDouble();
  
        //Display the output
        System.out.println("The wind chill temperature is : " + calculateWindChill(temp, windSpeed));
        
    }
}