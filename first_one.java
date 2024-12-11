public class Solution 
{
    public static int getFirstPosition(int[] arr, int n) 
    {
        int pos = -1;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 1)
            {
                pos = i+1;
                break;
            }
        }
        return pos;
    }
}