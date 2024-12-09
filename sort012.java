import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void sort012(int[] arr)
    {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,high);
                high--;
            }
        }
    }
}