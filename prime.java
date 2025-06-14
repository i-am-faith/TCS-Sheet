import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}

		if(count > 0 || n==1 || n==0)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}
}

/*
----------------------------Python-------------------------------------
from os import *
from sys import *
from collections import *
from math import *

n = int(input())
count = 0


for i in range(2,n):
    if n % i == 0:
        count += 1

if n == 0:
    print("false")
elif n == 1:
    print("false")
elif count > 1:
    print("false")
else:
    print("true")

*/
