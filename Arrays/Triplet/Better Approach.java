import java.util.*;

public class Solution {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        Set<List<Integer>> s = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            Set<Integer> s1 = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int sum = -(arr[i] + arr[j]);
                if (s1.contains(sum)) {
                    List<Integer> l1 = new ArrayList<>();
                    l1.add(arr[i]);
                    l1.add(arr[j]);
                    l1.add(sum);
                    Collections.sort(l1);
                    s.add(l1);
                }
                s1.add(arr[j]);
            }
        }
        List<List<Integer>> list = new ArrayList<>(s);
        return list;
    }
}
