import java.io.*;
import java.util.* ;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mpp.put(arr.get(i),mpp.getOrDefault(arr.get(i), 0)+1);
            if(mpp.get(arr.get(i)) > 1)
            {
                return arr.get(i);
            }
        }
        return -1;
    }
}


/*
---------------------------------Python-----------------------------------------------
from sys import *
from collections import *
from math import *

def findDuplicate(arr:list, n:int):
    freq = {}
    for num in arr:
        if num in freq:
            freq[num] += 1
        else:
            freq[num] = 1

    for i in arr:
        if freq[i] > 1:
            return i 

    return -1


*/