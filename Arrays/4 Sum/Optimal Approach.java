import java.util.*;

public class Solution {
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> l1 = new ArrayList<>();
                        l1.add(arr[i]);
                        l1.add(arr[j]);
                        l1.add(arr[k]);
                        l1.add(arr[l]);
                        list.add(l1);
                        while (k < l && arr[k] == arr[k + 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l - 1]) {
                            l--;
                        }
                        k++;
                        l--;
                    }
                }
            }
        }
        return list;
    }
}
