import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {

        Arrays.sort(a);
        int[] op = new int[2];
        op[0] = a[n-2];
        op[1] = a[1];

        return op;
    }
}

/*

-------------Python------------------------------------
def getSecondOrderElements(n: int,  a: [int]) -> [int]:
    a.sort()
    list=[]
    list.append(a[-2])
    list.append(a[1])
    return list


 */