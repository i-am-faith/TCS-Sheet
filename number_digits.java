import java.util.* ;
import java.io.*; 

public class Solution {
	public static ArrayList<Integer> numbersAndDigits(int n) {
        ArrayList<Integer> arrl = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            int sum = k;
            int temp = k;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            if (sum == n) {
                arrl.add(k);
            }
        }
        return arrl;
    }
}
