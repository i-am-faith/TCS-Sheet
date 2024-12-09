import java.util.* ;
import java.io.*; 
public class Solution {

	public static long sumOrProduct(int n, int q) {
		long sum = 0;
		long mult = 1;
		long mod = 1000000007;
		for(long i=1;i<=n;i++)
		{
			if(q == 1)
			{
				sum += i;
			}
			else if(q == 2)
			{
				mult = (mult*i)%mod;
			}
		}

		if(q == 1)
		{
			return sum;
		}
		else
		{
			return mult;
		}
	}
}
