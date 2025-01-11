import java.util.*;
public class Solution 
{
	public static int minimizeMaximum(int []arr, int n, int k) 
	{
		Arrays.sort(arr);
		int res = arr[n-1] - arr[0];

		for(int i=1;i<n;i++)
		{
			//if I am decreasing k from element and it goes negative then
			//dont decrease!
			if(arr[i] - k < 0)
			{
				continue;
			}
			else
			{
				//we are adding k to the minimum (first elm in sorted array)
				//and decreasing k from the present element
				int mini = Math.min(arr[i]-k,arr[0]+k);
				//we are adding k to the previous elment
				//and decreasing k from the maximum (last elm in sorted array)
				int maxi = Math.max(arr[i-1]+k,arr[n-1]-k);
				//now calculate max and mini and compare with result who is max
				res = Math.min(res,maxi-mini);
			}
		}
		return res;
	}
}
