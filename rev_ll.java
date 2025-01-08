import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        if(head == null || head.next == null)
		{
			return head;
		}
		LinkedListNode newHead = reverseLinkedList(head.next);
		LinkedListNode front = head.next;
		front.next = head;
		head.next = null;
		return newHead;
    }
}