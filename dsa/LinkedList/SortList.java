//https://leetcode.com/problems/sort-list/
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
  
    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }
    ListNode merge(ListNode first , ListNode second)
    {
        ListNode head1=new ListNode();
        ListNode tail=head1;
        while(first!=null && second!=null)
        {
            if(first.val<second.val){
                tail.next=first;
                first=first.next;
                tail=tail.next;
            }
            else{
                tail.next=second;
               second=second.next;
                tail=tail.next;
            }
        }
       tail.next=(first!=null)?first:second;
        return head1.next;
    }
    ListNode getMid(ListNode head){
    ListNode midPrev=null;
    while(head!=null && head.next!=null){
        midPrev=(midPrev==null)?head:midPrev.next;
        head=head.next.next;
            }
    ListNode mid=midPrev.next;
    midPrev.next=null;
    return mid;
}

}
