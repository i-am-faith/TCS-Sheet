import java.util.*;
public class Solution {
    public static void reversearr(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;
        while(left <= right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static int[] Klargest(int[] a, int k, int n) {
        int[] res = new int[k];
        Arrays.sort(a);
        reversearr(a);
        for(int i=0;i<k;i++)
        {
            res[i] = a[i];
        }
        reversearr(res);

        return res;
    }
}