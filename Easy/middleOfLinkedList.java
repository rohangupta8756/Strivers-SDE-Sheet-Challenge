public class Solution
{
    public static Node findMiddle(Node head)
    {
        // Write your code here.
        if(head == null) return null;
        
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}