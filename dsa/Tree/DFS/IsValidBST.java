 //98. Validate Binary Search Tree
    //https://leetcode.com/problems/validate-binary-search-tree/
    /*
              2
            /  \
           1    3
        o/p=true
     */
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    public boolean helper(TreeNode node,Integer low,Integer h){
        if(node==null)return true;

        if(low!=null && node.val<=low)return false;
        if(h!=null && node.val>=h)return false;

        boolean leftT=helper(node.left,low,node.val);
        boolean rightT=helper(node.right,node.val,h);

        return leftT && rightT;

    }
