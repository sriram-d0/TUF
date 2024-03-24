/*Problem statement
School is organizing a team contest. You are given an array ‘SKILL’ containing the skill level of ‘N’ candidates.



Two candidates(having index ‘i’ and ‘j’) can pair up to form a team if for index i < j, SKILL[i] > 2*SKILL[j].

Your task is the return the count of all the possible pairs to take part in the contest.



Example:
Input: ‘N’ = 5
‘SKILL’ = [4, 1, 2, 3, 1] 

Output: 3
Explanation:
Possible pairs are (4,1), (4,1), (3,1).*/

//Better Approach
public class Solution {
    public static int team(int []skill, int n){
       int c=0;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
           if(i<j && skill[i]>2*skill[j]){
               c++;
           }
           }
       }
       return c;
    }
}
