public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	int left = 0;
        int right = arr.length-1;
        while(left <= right)
        {
            if(arr[left] == 0)
            {
                left++;
            }
            else if(arr[left] == 1)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
}