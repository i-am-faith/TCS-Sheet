import java.util.*;
public class Solution {
	public static int gcd(int num1, int num2)
	{
		int gcd = 1;

		for(int i=1;i<=num1 && i<=num2;i++)
		{
			if(num1 % i == 0 && num2 % i == 0)
			{
				gcd = i;
			}
		}
		return gcd;
	}
	public static void main(String[] args)  
	{
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println(gcd(num1, num2));
        }

        sc.close();
	}
}

