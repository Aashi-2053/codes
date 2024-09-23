 //https://leetcode.com/problems/invert-binary-tree/
//226. Invert Binary Tree
    /*
            4                    4
          /   \               /    \
         2     7     =>      7      2
       /  \   / \          /  \    /  \
      1   3  6   9        9    6  3   1
     */
    public TreeNode invertTree(TreeNode root) {
        if (root==null) return null;

        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        root.left=right;
        root.right=left;

        return root;

    }
