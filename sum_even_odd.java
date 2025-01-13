import java.util.* ;
import java.io.*; 

public class Solution {
	public static int[] sumOfEvenOdd(long num, int evenSum, int oddSum) {
		int[] arr = new int[2];
		while(num > 0)
		{
			long rem = num % 10;
			if(rem % 2 == 0)
			{
				evenSum+=rem;
			}
			else
			{
				oddSum+=rem;
			}
			num/=10;
		}
		arr[0] = evenSum;
		arr[1] = oddSum;
		return arr;
	}
}