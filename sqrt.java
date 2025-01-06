import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		if(N == 0 || N == 1)
		{
			return (int) N;
		}
		long left = 0;
		long right = N/2;
		long ans = -1;
		while(left <= right)
		{
			long mid = left + (right - left)/2;
			long square = mid * mid;
			if(square == N)
			{
				return (int)mid;
			}
			else if(square < N)
			{
				ans = mid;
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
		}
		return (int) ans;
	}
}
