import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] swapNumber(int x, int y) {
		int[] op = new int[2];
		x = x + y;
		y = x - y;
		x = x - y;

		op[0] = x;
		op[1] = y;
		return op;
	}
}
