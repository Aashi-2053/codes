    //129. SUm Root To leaf numbers
    public int sumNumbers(TreeNode root) {
        return help1(root,0);
    }
    int help1(TreeNode node,int sum){
        if (node==null)return 0;

        sum=sum*10+node.val;
        if(node.left==null && node.right==null) return sum;
        return help1(node.left,sum)+help1(node.right,sum);
    }
