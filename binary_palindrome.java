import java.util.* ;
import java.io.*; 
public class Solution {
    private static String dectobin(long N)
    {
        StringBuilder bin = new StringBuilder();
        while(N > 0)
        {
            long rem = N % 2;
            bin.append(rem);
            N/=2;
        }
        return bin.reverse().toString();
    }
    public static boolean checkPalindrome(long N) {
        String binary = dectobin(N);
        int left = 0;
        int right = binary.length()-1;
        while(left < right)
        {
            if(binary.charAt(left) != binary.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}