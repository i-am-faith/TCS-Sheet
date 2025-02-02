import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	private static ArrayList<Long> combination(int row)
	{
		ArrayList<Long> arrl = new ArrayList<>();
		long res = 1;
		arrl.add(res);
		for(int col=1;col<row;col++)
		{
			res = res * (row - col);
			res /= col;
			arrl.add(res);
		}
		return arrl;
	}
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> arrl = new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			arrl.add(combination(i));
		}
		return arrl;
	}
}
