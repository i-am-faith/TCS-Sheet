import java.util.ArrayList;
//Advance Binary Search
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int left = 0;
        int right = n-1;
        while(left <= right)
        {
            int mid = left + (right-left)/2;
            if(arr.get(mid) == k)
            {
                return mid;
            }

            //Check Left Array Sorted
            else if(arr.get(left) <= arr.get(mid))
            {
                //left half
                if(arr.get(left) <= k && arr.get(mid) >= k)
                {
                    right = mid-1;
                }
                //right half
                else
                {
                    left = mid+1;
                }
            }
            //Check Right Array Sorted
            else
            {
                //left half
                if(arr.get(mid) <= k && arr.get(right) >= k)
                {
                    left = mid+1;
                }
                //right half
                else
                {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}