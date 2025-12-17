import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read height in centimeters
        double heightCm = sc.nextDouble();

        // Convert centimeters to inches
        double totalInches = heightCm / 2.54;

        // Calculate feet from inches
        int feet = (int) (totalInches / 12);

        // Calculate remaining inches
        double inches = totalInches % 12;

        // Display the result
        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + inches);
    }
}

