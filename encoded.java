import java.util.* ;
import java.io.*; 

class Solution {
  public static String encodeString(int n, String s) {
    char[] str = s.toLowerCase().toCharArray();
    for(int i=0;i<str.length;i++)
    {
      if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u')
      {
        str[i]++;
      }
      else
      {
        str[i]--;
      }
    }
    String coded = new String(str);
    return coded;
  }
}