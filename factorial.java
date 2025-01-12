import java.util.*;

class Solution {
	public static int factorial(int n)
	{
		if(n < 0)
		{
			return 0;
		}
		else if(n == 0 || n == 1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(factorial(n) == 0)
		{
			System.out.println("Error");
		}
		System.out.println(factorial(n));
	}
}