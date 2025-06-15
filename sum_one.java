import java.util.* ;
import java.io.*; 
public class Solution {

    public static int oneIteration(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int sum = A[n-1] + A[n-2];
        return sum;
    }
}

/*
------------------------Python-------------------------------------
from sys import *
from collections import *
from math import *
import sys
from typing import *

def oneIteration(A: List[int]) -> int:
    A.sort()
    maxsum = A[-1] + A[-2]
    return maxsum



*/