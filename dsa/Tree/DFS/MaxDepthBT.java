//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
    //104. Maximum Depth of Binary Tree
    //maximum depth is the number of nodes along the longest
    // path from the root node down to the farthest leaf node.
    //Input: root = [3,9,20,null,null,15,7]
    //Output: 3
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;

        int leftD=maxDepth(root.left);
        int rightD=maxDepth(root.right);
        int depth=Math.max(leftD,rightD)+1;

        return depth;
    }
