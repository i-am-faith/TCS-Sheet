import java.util.* ;
import java.io.*; 
public class Solution {

    public static ArrayList < Integer > findDuplicates(int[] arr, int n) {
        Map<Integer,Integer> mpp = new HashMap<>();
        ArrayList<Integer> arrl = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            mpp.put(arr[i],mpp.getOrDefault(arr[i], 0)+1);
        }

        for (int key : mpp.keySet()) {
            if (mpp.get(key) > 1) {
                arrl.add(key);
            }
        }

        return arrl;
    }
};


/*
----------------------------------------Python----------------------------------------
from os import *
from sys import *
from collections import *
from math import *

def findDuplicates(arr, n):
    freq = {}
    lst = []
    for num in arr:
        if num in freq:
            freq[num] += 1
        else:
            freq[num] = 1

    for key,value in freq.items():
        if value > 1:
            lst.append(key)

    return lst

*/