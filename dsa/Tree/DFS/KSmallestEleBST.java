
    //https://leetcode.com/problems/kth-smallest-element-in-a-bst/
    //230. Kth Smallest Element in a BST
/*
                  3
               /    \
              1      4
               \
                2
      Input: root = [3,1,4,null,2], k = 1
      Output: 1
 */
    int c=0;
    public int kthSmallest(TreeNode root,int k){
        return help(root, k).val;
    }
    public TreeNode help(TreeNode root, int k) {
        if (root==null) return null;

        TreeNode left=help(root.left,k);

        if (left!=null )return left;

        c++;

        if (c==k) return root;

        return help(root.right,k);
    }
