//1290. Convert Binary Number in a Linked List to Integer
//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
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
    public int getDecimalValue(ListNode head) {
      
       int n=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
         int ans=0;
         temp=head;
          while(temp!=null)
        {
            ans=ans+temp.val*(int)(Math.pow(2,--n));
            temp=temp.next;
        }
        return ans;

    }
}
