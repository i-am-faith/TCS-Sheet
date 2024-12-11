import java.util.* ;
import java.io.*; 
public class Solution {

    public static int oneIteration(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int sum = A[n-1] + A[n-2];
        return sum;
    }
}