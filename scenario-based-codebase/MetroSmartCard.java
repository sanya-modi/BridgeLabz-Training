import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 100.0; // Initial smart card balance

        System.out.println("Welcome to Delhi Metro");
        System.out.println("Initial Smart Card Balance: Rs. " + balance);

        while (balance > 0) {

            System.out.print("\nEnter travel distance in km (or -1 to quit): ");
            int distance = scanner.nextInt();

            // Exit condition
            if (distance == -1) {
                System.out.println("Thank you for using Delhi Metro.");
                break;
            }

            if (distance <= 0) {
                System.out.println("Invalid distance. Please try again.");
                continue;
            }

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10 : 20;

            // Balance check
            if (balance < fare) {
                System.out.println("Insufficient balance. Please recharge your card.");
                break;
            }

            // Deduct fare
            balance -= fare;

            // Output details
            System.out.println("Fare deducted: Rs. " + fare);
            System.out.println("Remaining Balance: Rs. " + balance);
        }

        scanner.close();
    }
}
