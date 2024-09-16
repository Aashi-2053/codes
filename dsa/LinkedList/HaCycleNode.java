//https://leetcode.com/problems/linked-list-cycle-ii/
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
    public ListNode detectCycle(ListNode head) {
         int len=0;
        ListNode fast=head;
         ListNode slow=head;

            while(fast!=null && fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast) {
                    len=lengthCycle(slow);
                  break;
                }
            }
            if(len==0){
                return null;
            }
            //find start
            ListNode f=head;
            ListNode s=head;
            while(len>0){
                s=s.next;
                len--;
            }
            //move till meet at s
            while(f!=s){
                f=f.next;
                s=s.next;
            }
            return s;
    
    }
     public int lengthCycle(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            if(head==null)
                return -1;
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
}
