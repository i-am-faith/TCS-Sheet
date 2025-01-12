import java.math.BigInteger;

public class Solution {
	public static void factorial(int n) {
		if(n <= 1)
		{
			System.out.println(1);
			return;
		}

		BigInteger[] dp = new BigInteger[n+1];
		dp[0] = BigInteger.ONE;
		dp[1] = BigInteger.ONE;
		for(int i=2;i<n+1;i++)
		{
			dp[i] = dp[i-1].multiply(BigInteger.valueOf(i));
		}

		System.out.println(dp[n]);
	}
}
