public class Solution{
    public static void swapNumber(int []a, int []b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }
}


/* 
-----------------------------------Python----------------------------------------
from typing import List

def swapNumber(a:list,  b: list) -> None:
    a[0],b[0] = b[0],a[0]
    

*/