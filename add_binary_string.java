import java.math.BigInteger;

public class Solution {

    public static String addBinaryString(String a, String b, int n, int m) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger sum = x.add(y);
        return sum.toString(2);
    }
}


//TLE !!!!!!
// public class Solution 
// {
// 	//input - binary , output - decimal
// 	public static int bintodec(int bin)
// 	{
// 		int dec = 0;
// 		int base = 1;
// 		while(bin > 0)
// 		{
// 			int rem = bin % 10;
// 			dec = dec + rem * base;
// 			bin /= 10;
// 			base *= 2;
// 		}
// 		return dec;
// 	}
// 	public static int dectobin(int dec)
// 	{
// 		int bin = 0;
// 		int base = 1;
// 		while(dec > 0)
// 		{
// 			int rem = dec % 2;
// 			bin = bin + rem * base;
// 			dec /= 2;
// 			base *= 10;
// 		}
// 		return bin;
// 	}
// 	public static String addBinaryString(String a, String b, int n, int m)
// 	{
// 		int x = Integer.parseInt(a);
// 		int y = Integer.parseInt(b);
// 		int binx = bintodec(x);
// 		int biny = bintodec(y);
// 		int sum = binx + biny;
// 		int sumdec = dectobin(sum);
// 		String binc = Integer.toString(sumdec);
// 		return binc;
// 	}
// }
