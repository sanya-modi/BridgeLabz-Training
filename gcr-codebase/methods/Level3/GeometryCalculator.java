import java.util.Scanner;

public class GeometryCalculator {

    // Method to find Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    // Method to find equation of line (slope m and intercept b)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Slope calculation
        double m = (y2 - y1) / (x2 - x1);
        // Y-intercept calculation
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get user input
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);
 
        //Display result
        System.out.println("\nEuclidean Distance = " + distance);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

    }
}
