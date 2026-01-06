package hashmap_hashfunction.two_sum_problem;
import java.util.Scanner;
import java.util.Arrays;

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

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int[] result = TwoSum.twoSum(arr, target);

        if (result[0] != -1) {
            System.out.println("Indices found: " + Arrays.toString(result));
            System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]]);
        } else {
            System.out.println("No valid pair found");
        }

        sc.close();
    }
}

