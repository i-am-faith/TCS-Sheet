import java.util.* ;
import java.io.*; 
/*
    The higherlower(int n) function can be called from guesser object
    @api: guesser.higherlower(n)
    return value will be -1 if n is lower, 0 is n is equal or 1 if n is higher.
*/

public class Solution {
    public static int numberGuess(int n, Guesser guesser) {
        int s = 0;
        int e = n;

        while(s <= e)
        {
            int mid = s + (e-s)/2;
            int val = guesser.higherlower(mid);
            if(val == 0)
            {
                return mid;
            }
            else if(val == 1)
            {
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
        }
        return -1;
    }
}