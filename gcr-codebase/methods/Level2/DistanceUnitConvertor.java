import java.util.*;

public class DistanceUnitConvertor{

    // Convert kilometers to miles
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters){
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet){
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 
        //Get input from user    
        double n = sc.nextDouble();

        //Display result in all units
        System.out.println("km to miles: " + convertKmToMiles(n));
        System.out.println("miles to km: " + convertMilesToKm(n));
        System.out.println("meters to feet: " + convertMetersToFeet(n));
        System.out.println("feet to meters: " + convertFeetToMeters(n));
    }
}
