    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

 //236. Lowest Common Ancestor of a Binary Tree
    /*
                         3
                      /    \
                     5      1
                   /  \    /  \
                  6   2   0    8
                     / \
                    7   4
     */
    //Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
    //Output: 3
    //Explanation: The LCA of nodes 5 and 1 is 3.
    //Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
    //Output: 5
    //Explanation: The LCA of nodes 5 and 4 is 5, since a
    // node can be a descendant of itself according to the
    // LCA definition.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) return null;

        if (root==p || root==q)return root;

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if (left!=null && right!=null)return root;

        if (left==null)return right;
        else return left;
    }

