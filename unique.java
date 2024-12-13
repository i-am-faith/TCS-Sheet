import java.util.* ;
import java.io.*;

public class Solution {

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {
		ArrayList<Integer> arrl = new ArrayList<>();
		Map<Integer,Integer> mpp = new HashMap<>();

		for(int i=0;i<arr.size();i++)
		{
			mpp.put(arr.get(i),mpp.getOrDefault(arr.get(i), 0)+1);
			if(mpp.get(arr.get(i)) == 1)
			{
				arrl.add(arr.get(i));
			}
		}

		return arrl;
	}
}