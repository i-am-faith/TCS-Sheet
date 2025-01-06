import java.util.* ;
import java.io.*; 

public class Solution {
	public static long maxSubarraySum(int[] arr, int n) {
		long currsum = 0;
		long maxi = 0;
		for(int i=0;i<n;i++)
		{
			currsum += arr[i];
			if(currsum > maxi)
			{
				maxi = currsum;
			}
			if(currsum < 0)
			{
				currsum = 0;
			}
		}
		return maxi;
	}
}
