import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		LinkedListNode<Integer> result = new LinkedListNode<>(0);
        LinkedListNode<Integer> tail = result;
        while(first != null && second != null)
        {
            if(first.data < second.data)
            {
                tail.next = new LinkedListNode<>(first.data);
                first = first.next;
            }
            else
            {
                tail.next = new LinkedListNode<>(second.data);
                second = second.next;
            }
            tail = tail.next;
        }

        while(first != null)
        {
            tail.next = new LinkedListNode<>(first.data);
            first = first.next;
            tail = tail.next;
        }

        while(second != null)
        {
            tail.next = new LinkedListNode<>(second.data);
            second = second.next;
            tail = tail.next;
        }

        return result.next;
	}
}
