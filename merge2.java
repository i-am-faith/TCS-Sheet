import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int left = 0;
        int right = 0;
        List<Integer> arrl = new ArrayList<>();
        while(left < m && right < n)
        {
            if(arr1[left] < arr2[right])
            {
                arrl.add(arr1[left]);
                left++;
            }
            else
            {
                arrl.add(arr2[right]);
                right++;
            }
        }

        while(left < m)
        {
            arrl.add(arr1[left]);
            left++;
        }
        while(right < n)
        {
            arrl.add(arr2[right]);
            right++;
        }

        for(int i=0;i<arrl.size();i++)
        {
            arr1[i] = arrl.get(i);
        }

        return arr1;
    }
}
