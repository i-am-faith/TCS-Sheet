import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}

		if(count > 0 || n==1 || n==0)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}
}