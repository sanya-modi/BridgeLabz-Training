package hashmap_hashfunction.two_sum_problem;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];

            // Check if complement exists
            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }

            // Store current element with its index
            map.put(arr[i], i);
        }

        return new int[] { -1, -1 }; // no solution
    }
}

