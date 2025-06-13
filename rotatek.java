import java.util.*;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;
        ArrayList<Integer> res = new ArrayList<>();
        //Store Right Elements
        for(int i=k;i<n;i++)
        {
            res.add(arr.get(i));
        }

        //Store Left Elements
        for(int i=0;i<k;i++)
        {
            res.add(arr.get(i));
        }

        return res;
    }
}


/*
--------------------------------------Python-----------------------------------
def rotateArray(arr: list, k: int) -> list:
    n = len(arr)
    k = k % n
    lst = []

    # First append right elements
    for i in range(k, n):
        lst.append(arr[i])

    # Then append left elements
    for i in range(0, k):
        lst.append(arr[i])

    return lst


*/