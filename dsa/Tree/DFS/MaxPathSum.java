   //124. Binary Tree Maximum Path Sum

    //                 -10
    //               /    \
    //              9      20
    //                    /   \
    //                   15    7
    //Input: root = [-10,9,20,null,null,15,7]
    //Output: 42
    //Explanation: The optimal path is
    // 15 -> 20 -> 7 with a path sum of
    // 15 + 20 + 7 = 42.


    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper3(root);
        return ans;
    }
    int helper3(TreeNode node){
        if (node==null)return 0;
       int left= helper3(node.left);
        int right= helper3(node.right);
        left=Math.max(0,left);
        right=Math.max(0,right);

        int sum=left+right+node.val;

        ans=Math.max(ans,sum);
        return Math.max(left,right)+node.val;
    }
