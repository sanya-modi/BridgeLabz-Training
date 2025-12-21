import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta 
        double delta = Math.pow(b, 2) - 4 * a * c;
        // If delta is negative 
        if (delta < 0) {
        return new double[0];  // empty array
        }
        // If delta is zero → one root
        if (delta == 0) {
        double root = -b / (2 * a);
        return new double[]{root};
        }
        // If delta is positive → two roots
        double sqrtDelta = Math.sqrt(delta);
        double root1 = (-b + sqrtDelta) / (2 * a);
        double root2 = (-b - sqrtDelta) / (2 * a);
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Take a, b, and c as input values
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        //find the roots of x
        double[] roots = findRoots(a, b, c);

        //Display the roots
        if(roots.length == 0){
        System.out.println("delta is negative");
        } 
        else if(roots.length == 1){
        System.out.println("Only one root: " + roots[0]);
        } 
        else{
        System.out.println("Root 1: " + roots[0]);
        System.out.println("Root 2: " + roots[1]);
        }

    }
}
