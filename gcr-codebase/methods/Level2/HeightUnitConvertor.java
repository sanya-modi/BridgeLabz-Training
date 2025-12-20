import java.util.Scanner;

public class HeightUnitConvertor{

    // Convert yards to feet
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3;
    return yards * yards2feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet){
        double feet2yards = 0.333333;
    return feet * feet2yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters){
        double meters2inches = 39.3701;
    return meters * meters2inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches){
        double inches2meters = 0.0254;
    return inches * inches2meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get input from user
        double n = sc.nextDouble();

        //Display result in all units
        System.out.println("yards to feet: " + convertYardsToFeet(n));
        System.out.println("feet to yards: " + convertFeetToYards(n));
        System.out.println("meters to inches: " + convertMetersToInches(n));
        System.out.println("inches to meters: " + convertInchesToMeters(n));
        System.out.println("inches to centimeters: " + convertInchesToCentimeters(n));
    }
}
