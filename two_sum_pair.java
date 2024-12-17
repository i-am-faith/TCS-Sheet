import java.util.*;

public class Solution {
	public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		ArrayList<Pair<Integer,Integer>> arrl = new ArrayList<>();
		Collections.sort(arr);

		int low = 0;
		int high = n-1;

		while(low < high)
		{
			int result = arr.get(low) + arr.get(high);

			if(result > target)
			{
				high--;
			}
			else if(result < target)
			{
				low++;
			}
			else
			{
				arrl.add(new Pair<>(arr.get(low),arr.get(high)));
				low++;
				high--;
			}
		}

		if(arrl.isEmpty())
		{
			arrl.add(new Pair<>(-1,-1));
		}

		return arrl;
	}
}
