import java.util.*;

public class TrigonometryCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);
        // Calculate trigonometric values
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        // Store results in array
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
        //Take angle in degrees
        double angle = sc.nextDouble(); 
        double[] result = calculateTrigonometricFunctions(angle);

        //Display the ouput
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
    }
}
