import java.util.* ;
import java.io.*; 

public class Solution {
    
    static int[] countVowelsConsonantsSpaces(String s, int n) {
        s = s.toUpperCase();
        int vc=0, cc=0, sc=0;
        int[] arr = new int[3];
        char[] c = s.toCharArray();
        for(int i=0;i<n;i++)
        {
            if(c[i] >= 'A' && c[i] <= 'Z')
            {
                if(c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U')
                {
                    vc++;
                }
                else
                {
                    cc++;
                }
            }
            else if(c[i] == ' ')
            {
                sc++;
            }
        }
        arr[0] = vc;
        arr[1] = cc;
        arr[2] = sc;

        return arr;
    }
}