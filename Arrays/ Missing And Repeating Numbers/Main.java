/*You are given an array of ‘N’ integers where each integer value is between ‘1’ and ‘N’.
Each integer appears exactly once except for ‘P’, which appears exactly twice, and ‘Q’, which is missing.
Your task is to find ‘P’ and ‘Q’ and return them respectively.

Example:
Input: ‘N’ = 4
‘A’ = [1, 2, 3, 2]

Output: {2, 4}

Explanation: The integer appearing twice is ‘2’, and the integer missing is ‘4’.*/

//Source Code
import java.util.*;
public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        int repeat=0;
        int[] result=new int[2];
        int n=a.length;
        Set<Integer> set=new HashSet<Integer>();
        for(int i:a){
            if(!set.add(i)){
                repeat=i;
            }
        }
        int missing=0;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                missing=i;
            }
        }
        result[0]=repeat;
        result[1]=missing;
        return result;
    }
}
