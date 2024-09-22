//199. Binary Tree Right Side View
    //https://leetcode.com/problems/binary-tree-right-side-view/

    public List<Integer> rightView(TreeNode root){
        List<Integer> res = new ArrayList<>();

        if (root == null) return res;

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);

        while (!que.isEmpty()) {
            int levelSize = que.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = que.poll();
                if(i==levelSize-1){
                    res.add(curr.val);
                }
                if (curr.left != null) {
                    que.offer(curr.left);
                }
                if (curr.right != null) {
                    que.offer(curr.right);
                }
            }
        }
        return res;
    }
