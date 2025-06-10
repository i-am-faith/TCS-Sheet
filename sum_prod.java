import java.util.* ;
import java.io.*; 
public class Solution {

	public static long sumOrProduct(int n, int q) {
		long sum = 0;
		long mult = 1;
		long mod = 1000000007;
		for(long i=1;i<=n;i++)
		{
			if(q == 1)
			{
				sum += i;
			}
			else if(q == 2)
			{
				mult = (mult*i)%mod;
			}
		}

		if(q == 1)
		{
			return sum;
		}
		else
		{
			return mult;
		}
	}
}

/*
---------------------------------Python--------------------------------------
from os import *
from sys import *
from collections import *
from math import *


def sumOrProduct(n, q):
    MOD = 10**9 + 7
    sum = 0
    if q == 1:
        for i in range(1,n+1):
            sum += i 
        return sum
    elif q == 2:
        prod = 1
        for i in range(1, n + 1):
            prod = (prod * i) % MOD
        return prod

*/