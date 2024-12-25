import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countConsonants(String str) {
		int count = 0;
		String st = str.toLowerCase().replace(" ","");
		char[] arr = st.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u')
			{
				count++;
			}
		}
		return count;
	}
}