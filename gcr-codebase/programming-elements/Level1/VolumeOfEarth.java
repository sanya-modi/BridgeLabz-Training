import java.util.*;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        //Calculate volume of earth in kilometers
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        //Calculate volume of earth in miles 
        double volumeMiles = volumeKm * Math.pow(0.621371, 3);
        
        //Print the volume in both kilometers and miles
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
