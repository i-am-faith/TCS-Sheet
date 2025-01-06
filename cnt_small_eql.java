import java.util.* ;
import java.io.*; 
public class Solution {
    public static int find(int val , int[] arr)
    {
        int left = 0;
        int right = arr.length-1;
        while(left <= right)
        {
            int mid = left + (right-left)/2;
            if(arr[mid] > val)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return left;
    }
    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            ans.add(find(a[i],b));
        }
        return ans;
    }
}