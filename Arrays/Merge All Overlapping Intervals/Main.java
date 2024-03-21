/*  PROBLEM STATEMENT
  Ninja is playing with intervals. He has an array of intervals called ‘Arr’ having ‘N’ intervals.



However, he doesn’t like overlapping intervals. So you must help Ninja by merging all the overlapping intervals in ‘Arr’ and return an array of non-overlapping intervals.



Note:
Two intervals [L1, R1] and [L2, R2] such that L1 <= L2, are said to be overlapping if and only if L2 <= R1.
For example:
For ‘N’ = 4, and 
‘Arr’ = {{1, 3}, {2, 4}, {3, 5}, {6, 7}}
We can see that {1, 3} and {2, 4} overlap, so if we merge them, we get {1, 4}.
Now ‘Arr’ becomes: {{1, 4}, {3, 5}, {6, 7}}
Still, we observe that {1, 4} and {3, 5} overlap, hence we merge them into {1, 5}.
Hence, ‘Arr’ becomes {{1, 5}, {6, 7}}.*/

//SOURCE CODE
import java.util.*;

public class Solution {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (arr[i][1] >= arr[i + 1][0]) {
                arr[i + 1][0] = Math.min(arr[i][0], arr[i + 1][0]);
                arr[i + 1][1] = Math.max(arr[i][1], arr[i + 1][1]);
            } else {
                List<Integer> interval = new ArrayList<>();
                interval.add(arr[i][0]);
                interval.add(arr[i][1]);
                list.add(interval);
            }
        }

        // Add the last interval
        List<Integer> lastInterval = new ArrayList<>();
        lastInterval.add(arr[n - 1][0]);
        lastInterval.add(arr[n - 1][1]);
        list.add(lastInterval);

        return list;
    }
}
