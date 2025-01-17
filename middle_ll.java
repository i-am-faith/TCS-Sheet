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

public class Solution
{
    public static Node findMiddle(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null)
        {
            slow = slow.next;
            if(fast.next.next == null)
            {
                return slow;
            }
            fast = fast.next.next;
        }
        return slow;
    }
}