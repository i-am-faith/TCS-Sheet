import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static void heapify(ArrayList<Integer> arr, int n, int i)
	{
		int largest = i; //make ith node largest
		int left = 2*i + 1; //left child
		int right = 2*i+2; //right child

		//checking left child if it is greater than largest node
		if(left < n && arr.get(left) > arr.get(largest))
		{
			largest = left;
		}

		//checking right child if it is greater than largest node
		if(right < n && arr.get(right) > arr.get(largest))
		{
			largest = right;
		}

		//if ith node is not largest then either left or right child is largest
		//swap them
		if(i != largest)
		{
			Collections.swap(arr,i,largest);
			//call recursive heapify continously to maintain the property of max heap
			heapify(arr, n, largest);
		}
	}
	public static void buildheap(ArrayList<Integer> arr, int n)
	{
		//2> start from the leaf node to root node from array and add elements 
		//call heapify continously to maintain the property of max heap
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
	}
	public static ArrayList<Integer> heapSort(ArrayList<Integer> arr, int n) {
		//1> First we need to create a max heap
		buildheap(arr,n);
		for(int i=n-1;i>0;i--)
		{
			Collections.swap(arr, 0, i);
			//In this heapify we have to decrement each element from stack memory to heap memory
			//so we have to decrease arraylist size
			//so we are passing size as i and making root node as largest node
			heapify(arr,i,0);
		}
		return arr;
	}
}