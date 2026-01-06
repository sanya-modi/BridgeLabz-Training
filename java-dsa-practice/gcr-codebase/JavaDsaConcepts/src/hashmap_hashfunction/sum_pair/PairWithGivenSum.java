package hashmap_hashfunction.sum_pair;
import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

    public static void findPair(int[] arr, int target) {

        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int needed = target - num;

            if (seen.contains(needed)) {
                System.out.println("Pair found: " + needed + ", " + num);
                return;
            }

            seen.add(num);
        }

        System.out.println("No pair found");
    }
}


