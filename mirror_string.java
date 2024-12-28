import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean isReflectionEqual(String s) {
        Set<Character> mirror = new HashSet<>(
            Arrays.asList('A', 'H', 'I', 'M', 'O', 'T', 'U', 'V', 'W', 'X', 'Y')
        );
        int left = 0;
        int right = s.length()-1;

        while(left <= right)
        {
            char leftchar = s.charAt(left);
            char rightchar = s.charAt(right);

            //if it doesnt contain mirror chars then it is false
            //if 0th index is not similar to n-1th index and so on it is false
            if(!mirror.contains(leftchar) || leftchar != rightchar)
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
