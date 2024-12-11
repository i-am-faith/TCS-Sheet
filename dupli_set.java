import java.util.* ;
import java.io.*; 
public class Solution {

    public static ArrayList < Integer > findDuplicates(int[] arr, int n) {
        Map<Integer,Integer> mpp = new HashMap<>();
        ArrayList<Integer> arrl = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            mpp.put(arr[i],mpp.getOrDefault(arr[i], 0)+1);
        }

        for (int key : mpp.keySet()) {
            if (mpp.get(key) > 1) {
                arrl.add(key);
            }
        }

        return arrl;
    }
};
