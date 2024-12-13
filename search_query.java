import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean bs(int[] arr , int n , int key)
    {
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == key)
            {
                return true;
            }
            else if(arr[mid] > key)
            {
                high = mid-1;
            }
            else if(arr[mid] < key)
            {
                low = mid+1;
            }
        }
        return false;
    }
    public static List<Integer> searchInSortedArray(int[] arr, int n, int[] queries, int q) {
        List<Integer> arrl = new ArrayList<>();
        for(int i=0;i<queries.length;i++)
        {
            int key = queries[i];
            if(bs(arr, n, key))
            {
                arrl.add(1);
            }
            else
            {
                arrl.add(0);
            }
        }
        return arrl;
    }
}
