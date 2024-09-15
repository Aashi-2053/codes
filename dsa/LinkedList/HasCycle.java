//https://leetcode.com/problems/linked-list-cycle/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null)
            return false;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            return true;
        }
        return false;
    }
}
//length of Linked List
   public int CycleLength(Node head) {
            Node fast=head;
            Node slow=head;
            if(head==null)
                return false;
            while(fast!=null && fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast) {
                    ListNode temp= slow;
                    int len=0;
                    do{
                        temp=temp.next;
                        len++;
                    }while (temp!=slow);
                    return len;
                }
            }
            return 0;
        }
