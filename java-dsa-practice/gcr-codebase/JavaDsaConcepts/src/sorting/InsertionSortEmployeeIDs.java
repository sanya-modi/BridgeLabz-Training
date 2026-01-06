package sorting;

import java.util.Scanner;

public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empIds = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            empIds[i] = sc.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = empIds[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // Insert key at correct position
            empIds[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs (Ascending):");
        for (int id : empIds) {
            System.out.print(id + " ");
        }

        sc.close();
    }
}

