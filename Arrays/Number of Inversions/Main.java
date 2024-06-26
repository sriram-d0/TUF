/*Problem statement
There is an integer array ‘A’ of size ‘N’.



Number of inversions in an array can be defined as the number of pairs of ‘i’, ‘j’ such that ‘i’ < ‘j’ and ‘A[i]’ > ‘A[j]’.

You must return the number of inversions in the array.



For example,
Input:
A = [5, 3, 2, 1, 4], N = 5
Output:
7
Explanation: 
The pairs satisfying the condition for inversion are (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), and (3, 4). 
The number of inversions in the array is 7.*/
//Source code
import java.util.*;
public class Solution {
    public static int numberOfInversions(int []a, int n) {
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if( (i<j) && (a[i]>a[j]) ){
                    c=c+1;
                }
            }
        }
        return c;
    }
}
