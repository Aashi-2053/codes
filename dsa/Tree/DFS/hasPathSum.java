  //112. Path Sum
//Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
//Output: true
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;

        if(root.val==sum&& root.left==null&& root.right==null)return true;

        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
