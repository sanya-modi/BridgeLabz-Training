package payxpress;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many bills do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Bill[] bills = new Bill[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Bill " + (i + 1));

            System.out.print("Enter bill type (Electricity / Water / Internet): ");
            String type = sc.nextLine();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            System.out.print("Is this a recurring bill? (true/false): ");
            boolean recurring = sc.nextBoolean();

            Bill bill;

            if (recurring) {
                // due date automatically set to next month
                if (type.equalsIgnoreCase("Electricity")) {
                    bill = new ElectricityBill(amount);
                } else if (type.equalsIgnoreCase("Water")) {
                    bill = new WaterBill(amount);
                } else {
                    bill = new InternetBill(amount);
                }
            } else {
                System.out.print("Enter due date (YYYY-MM-DD): ");
                sc.nextLine(); // consume newline
                LocalDate dueDate = LocalDate.parse(sc.nextLine());

                if (type.equalsIgnoreCase("Electricity")) {
                    bill = new ElectricityBill(amount, dueDate);
                } else if (type.equalsIgnoreCase("Water")) {
                    bill = new WaterBill(amount, dueDate);
                } else {
                    bill = new InternetBill(amount, dueDate);
                }
            }

            // Dynamic polymorphism
            bill.sendReminder();

            System.out.print("Do you want to pay now? (true/false): ");
            boolean payNow = sc.nextBoolean();

            if (payNow) {
                bill.pay();
            } else {
                double lateAmount = bill.calculateLateFee(100);
                System.out.println("Amount after late fee: ₹" + lateAmount);
            }

            bills[i] = bill;
            sc.nextLine(); // prepare for next loop
        }

        System.out.println("\n------ BILL SUMMARY ------");
        for (Bill b : bills) {
            b.showBillDetails();
        }

        sc.close();
    }
}

