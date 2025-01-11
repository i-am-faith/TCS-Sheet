import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    private static boolean findval(ArrayList<Integer> arr, int target)
    {
        int left = 0;
        int right = arr.size() - 1;
        while(left <= right)  
        {
            int mid = left + (right - left) / 2;
            if(arr.get(mid) == target)
            {
                return true;
            }
            else if(arr.get(mid) > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return false;
    }

    public static ArrayList<ArrayList<Integer>> pairs(ArrayList<Integer> arr, int n) {
       Collections.sort(arr); // Sorting the array for binary search
       ArrayList<ArrayList<Integer>> result = new ArrayList<>();
       HashSet<String> seenPairs = new HashSet<>(); // Preventing duplicate pairs
       
       for(int i = 0; i < arr.size(); i++)
       {
           int opps = -arr.get(i);  // Fixed the calculation for opposite value
           
           if(findval(arr, opps) && arr.get(i) < opps) // Avoid reverse duplicates
           {
               ArrayList<Integer> pair = new ArrayList<>();
               pair.add(arr.get(i));
               pair.add(opps);
               String pairKey = arr.get(i) + "," + opps;
               
               if(!seenPairs.contains(pairKey)) { 
                   result.add(pair);
                   seenPairs.add(pairKey); // Track added pairs
               }
           }
       }
       return result;
    }
}
