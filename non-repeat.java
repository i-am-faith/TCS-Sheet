import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> findNonRepeating(ArrayList<Integer> a) {
		ArrayList<Integer> arrl = new ArrayList<>();
		Map<Integer,Integer> mpp = new HashMap<>();
		for(int i=0;i<a.size();i++)
		{
			mpp.put(a.get(i),mpp.getOrDefault(a.get(i), 0)+1);
		}

		for(int i=0;i<a.size();i++)
		{
			if(mpp.get(a.get(i)) == 1)
			{
				arrl.add(a.get(i));
			}
		}

		return arrl;
	}
}