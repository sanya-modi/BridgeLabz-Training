import java.util.Scanner;

public class CollinearPoints{

    // Method to check collinearity using slope formula
    public static boolean isCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
       // To avoid division, use cross multiplication
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * ( x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        //Get user input
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        boolean slopeResult = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);
   
        //Display result
        System.out.println("\nUsing Slope Formula: " + slopeResult);
        System.out.println("Using Area Formula: " + areaResult);
        if (slopeResult && areaResult) {
            System.out.println("The given points are COLLINEAR");
        } 
        else {
            System.out.println("The given points are NOT collinear");
        }

    }
}
