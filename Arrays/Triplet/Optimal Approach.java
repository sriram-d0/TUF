import java.util.*;

public class Solution {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(arr[k]);
                    list.add(triplet);
                    
                    // Move j and k to avoid duplicates
                    while (j < k && arr[j] == arr[j + 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return list;
    }
}
