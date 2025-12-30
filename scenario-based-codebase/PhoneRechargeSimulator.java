/*
Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
- Use a switch to display offers.
- Loop to allow repeated recharges.
- Show balance after each recharge.
*/
import java.util.*;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        double balance = 0;
        char choice;

        do {
            System.out.print("\nEnter Mobile Operator (Airtel / Jio / VI): ");
            String operator = sc.next().toLowerCase();

            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            balance += amount;

            // Display offers using switch
            switch (operator) {
                case "airtel":
                    System.out.println("Offer: 1.5GB/day for 28 days");
                    break;

                case "jio":
                    System.out.println("Offer: 2GB/day + Unlimited Calls");
                    break;

                case "vi":
                    System.out.println("Offer: Weekend Data Rollover");
                    break;

                default:
                    System.out.println("No offers available for this operator");
            }

            System.out.printf("Current Balance: ₹%.2f%n", balance);

            System.out.print("\nDo you want to recharge again? (Y/N): ");
            choice = sc.next().toUpperCase().charAt(0);

        } while (choice == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator");
    }
}
