import java.util.*;

public class Solution {
    public static List<List<Integer>> triplet(int n, int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        // Sort the triplet to handle duplicates
                        Collections.sort(triplet);
                        set.add(triplet);
                    }
                }
            }
        }
        // Convert set to list
        List<List<Integer>> result = new ArrayList<>(set);
        return result;
    }
}
