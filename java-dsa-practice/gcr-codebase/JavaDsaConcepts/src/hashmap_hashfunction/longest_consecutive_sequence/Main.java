package hashmap_hashfunction.longest_consecutive_sequence;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = LongestConsecutiveSequence.longestConsecutive(arr);
        System.out.println("Longest consecutive sequence length: " + result);

        sc.close();
    }
}

