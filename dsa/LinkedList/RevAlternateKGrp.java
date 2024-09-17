
// https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
  public ListNode RevAlternateKGrp(ListNode head,int k){
        if(k<=1 || head==null) return head;
        ListNode current=head,prev=null;

        while (current!=null) {
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;
           //skip k nodes
            for(int i=0;current!=null&&i<k;i++){
                prev=current;
                current=current.next;
            }

        }
        return head;
    }
