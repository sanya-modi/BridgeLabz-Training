package sorting.zipzipmart;

import java.util.Scanner;

public class ZipZipMart {

    // Transaction fields
    String date;   // YYYY-MM-DD
    int amount;

    // Constructor
    ZipZipMart(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    // Merge Sort
    static void mergeSort(ZipZipMart[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Stable Merge function
    static void merge(ZipZipMart[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        ZipZipMart[] L = new ZipZipMart[n1];
        ZipZipMart[] R = new ZipZipMart[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            int dateCompare = L[i].date.compareTo(R[j].date);

            if (dateCompare < 0 ||
               (dateCompare == 0 && L[i].amount <= R[j].amount)) {
                arr[k++] = L[i++];   // keeps stability
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Dynamic main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        ZipZipMart[] transactions = new ZipZipMart[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter date (YYYY-MM-DD): ");
            String date = sc.next();

            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            transactions[i] = new ZipZipMart(date, amount);
        }

        mergeSort(transactions, 0, n - 1);

        System.out.println("\nSorted Daily Sales Report:");
        for (ZipZipMart t : transactions) {
            System.out.println(t.date + " - " + t.amount);
        }

        sc.close();
    }
}

