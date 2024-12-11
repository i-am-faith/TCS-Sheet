public class Solution {
    public static int searchInsert(int [] arr, int m){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == m)
            {
                return mid;
            }
            else if(arr[mid] < m)
            {
                low = mid+1;
            }
            else if(arr[mid] > m)
            {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}