package sorting.fleetmanager;

import java.util.Scanner;

public class FleetManagerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vehicles:");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Vehicle ID:");
            String id = sc.next();

            System.out.println("Enter Mileage:");
            int mileage = sc.nextInt();

            vehicles[i] = new Vehicle(id, mileage);
        }

        // Merge Sort call
        FleetMergeSort.mergeSort(vehicles, 0, n - 1);

        System.out.println("Vehicle sorted by mileage");
        FleetMergeSort.display(vehicles);

        sc.close();
    }
}
