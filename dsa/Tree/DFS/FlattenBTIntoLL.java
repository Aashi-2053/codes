/114.  Flatten Binary Tree to Linked List
    //https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

    public void flatten(TreeNode root) {
        /*
                    1                 1
                 /    \                \
                2      5     =>         2
              /  \       \               \
             3    4       6               3
                                           \
                                            4
                                             \
                                              5
                                               \
                                                6
         */
        TreeNode curr=root;
        while (curr!=null)
        {
            if (curr.left!=null){
                TreeNode temp= curr.left;
                while (temp.right!=null)
                {
                    temp=temp.right;
                }
                temp.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }
