package sorting.medwarehouse;

import java.util.Scanner;

public class MedWarehouseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of medicines: ");
        int n = sc.nextInt();
        sc.nextLine();

        Medicine[] medicines = new Medicine[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Medicine " + (i + 1));

            System.out.print("Medicine ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Medicine Name: ");
            String name = sc.nextLine();

            System.out.print("Expiry in days: ");
            int expiry = sc.nextInt();

            medicines[i] = new Medicine(id, name, expiry);
        }

        // Merge Sort medicines by expiry date
        MedicineSorting.mergeSort(medicines, 0, n - 1);

        System.out.println("\n💊 Medicines Sorted by Expiry (Urgent First):");
        for (Medicine m : medicines) {
            m.display();
        }

        // Alert for medicines expiring soon
        System.out.println("\n⚠ Medicines Expiring Within 10 Days:");
        for (Medicine m : medicines) {
            if (m.expiryDays <= 10) {
                m.display();
            }
        }

        sc.close();
    }
}

