public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        int count = n;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i] == arr[i+1])
            {
                count--;
            }
        }
        return count;
    }
}


/*
--------------------------Python----------------------------------------------
def removeDuplicates(arr,n):
    count = n
    for i in range(0,n-1):
        if arr[i] == arr[i+1]:
            count -= 1

    return count

*/