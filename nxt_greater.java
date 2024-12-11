public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        int a[] = new int[n];
        for(int i=0;i<n-1;i++)
        {
            a[i] = -1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] > arr[i])
                {
                    a[i] = arr[j];
                    break;
                }
            }
        }
        a[n-1] = -1;
        return a;
    }
}