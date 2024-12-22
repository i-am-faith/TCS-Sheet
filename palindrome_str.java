import java.util.*;
class Solution {
    public String reverse(String s)
    {
        char[] str = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left < right)
        {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return new String(str);
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLetterOrDigit(ch[i]))
            {
                sb.append(ch[i]);
            }
        }

        String main = sb.toString().toLowerCase();
        String rev = reverse(main);
        if(main.equals(rev))
        {
            return true;
        }
        return false;
    }
}