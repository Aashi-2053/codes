 //https://leetcode.com/problems/diameter-of-binary-tree/

    //543. Diameter of Binary Tree
    //Input: root = [1,2,3,4,5]
    //Output: 3
    //Explanation: 3 is the length of the path
    // [4,2,1,3] or [5,2,1,3].
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia-1;
    }
    int height(TreeNode node){
        if(node==null) return 0;

        int leftH=height(node.left);
        int rightH=height(node.right);

        int diameter=leftH+rightH+1;
        dia=Math.max(diameter,dia);

        return Math.max(leftH,rightH)+1;
    
}
