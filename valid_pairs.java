import java.util.*;
public class Solution 
{
	public static boolean isValidPair(int[] arr, int n, int k, int m) 
	{
		if(n % 2 != 0)
		{
			return false;
		}
		Map<Integer,Integer> mpp = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int rem = arr[i] % k;
			mpp.put(rem,mpp.getOrDefault(rem, 0)+1);
		}

		for(int i=0;i<n;i++)
		{
			int rem = arr[i] % k;
			int complement = (m - rem + k) % k;

			if(mpp.containsKey(complement))
			{
				int freq = mpp.get(complement);
				if(freq > 0)
				{
					mpp.put(complement,freq-1);
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}