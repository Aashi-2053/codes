//https://leetcode.com/problems/palindrome-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  

public boolean isPalindrome(ListNode head) {
    ListNode mid=middleNode(head);
       ListNode headSec=reverseList(mid);
       ListNode reRevHead=headSec;
       //compare
       while(head!=null&&headSec!=null)
       {
           if(head.val!=headSec.val) break;
           head=head.next;
           headSec=headSec.next;
       }
       reverseList(reRevHead);
       if(head==null||headSec==null){
           return true;
       }
       return false;
}
public ListNode reverseList(ListNode head) {
       if (head==null) {
           return head;
       }
       ListNode prev = null;
       ListNode present = head,next = present.next;
       while (present != null) {
           present.next = prev;
           prev = present;
           present = next;
           if (next != null)
               next = next.next;
       }
       return prev;
   }
    public ListNode middleNode(ListNode head){
        ListNode s=head,f=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

}
