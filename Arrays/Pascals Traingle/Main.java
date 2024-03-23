import java.util.*;
public class Solution {
    public static int[][] pascalTriangle(int N) {
        int[][] arr = new int[N][];
        for (int i = 0; i < N; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        return arr;
    }
}
