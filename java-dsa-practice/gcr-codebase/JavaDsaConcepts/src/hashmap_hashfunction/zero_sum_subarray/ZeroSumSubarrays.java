package hashmap_hashfunction.zero_sum_subarray;
import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {

        // Map: cumulative sum -> list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Case 1: Subarray from index 0 to i
            if (sum == 0) {
                System.out.println("Subarray found from index 0 to " + i);
            }

            // Case 2: Sum already exists
            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println(
                        "Subarray found from index " + (startIndex + 1) + " to " + i
                    );
                }
            }

            // Add current index to the map
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }
}
