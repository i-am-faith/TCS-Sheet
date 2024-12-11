import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();
        //Check For Leftmost Element
        if(arr.get(0) > arr.get(1))
        {
            return 0;
        }
        //Check For Rightmost Element
        if(arr.get(n-1) > arr.get(n-2))
        {
            return n-1;
        }

        for(int i=1;i<n-1;i++)
        {
            if(arr.get(i) > arr.get(i+1) && arr.get(i) > arr.get(i-1))
            {
                return i;
            }
        }

        return -1;
    }
};
