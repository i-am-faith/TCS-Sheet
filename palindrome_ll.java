/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

import java.util.*;
public class Solution {
    public static boolean isPalindrome(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp!=null)
        {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;

        while(temp != null)
        {
            if(temp.data != st.pop())
            {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }
}