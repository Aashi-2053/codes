    //https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res = new ArrayList<>();

        if (root == null) return res;

        Deque<TreeNode> que = new LinkedList<>();

        que.offer(root);
        boolean rev=false;
        while (!que.isEmpty()) {
            int levelSize = que.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if(!rev)
                {
                    TreeNode curr = que.pollFirst();
                    currLevel.add(curr.val);
                    if(curr.left!=null){
                        que.addLast(curr.left);
                    }
                    if(curr.right!=null){
                        que.addLast(curr.right);
                    }
                }
              else{
                    TreeNode curr = que.pollLast();
                    currLevel.add(curr.val);

                    if(curr.right!=null){
                        que.addFirst(curr.right);
                    }
                    if(curr.left!=null){
                        que.addFirst(curr.left);
                    }

                }

            }
            rev=!rev;
            res.add(currLevel);
        }
        return res;
    }
}
