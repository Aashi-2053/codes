/https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
    //116. Populating Next Right Pointers in Each Node
    //Input: root = [1,2,3,4,5,6,7]
    //Output: [1,#,2,3,#,4,5,6,7,#]
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         if (root==null)return null;

        Node leftMost=root;

        while (leftMost.left!=null){
         Node curr=leftMost;
         while (curr!=null){
             curr.left.next=curr.right;
             if (curr.next!=null)
             {
                 curr.right.next=curr.next.left;

             }
             curr=curr.next;
         }
         leftMost=leftMost.left;
        }
        return root;
    }
}
