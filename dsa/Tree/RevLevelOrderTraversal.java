 //107. Binary Tree Level Order Traversal II
    //https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

            if(root ==null)return res;

    Queue<TreeNode> que = new LinkedList<>();

            que.offer(root);
            while(!que.isEmpty())

    {
        int levelSize = que.size();
        List<Integer> currLevel = new ArrayList<>(levelSize);
        for (int i = 0; i < levelSize; i++) {
            TreeNode curr = que.poll();
            currLevel.add(curr.val);
            if (curr.left != null) {
                que.offer(curr.left);
            }
            if (curr.right != null) {
                que.offer(curr.right);
            }
        }
        res.add(0,currLevel);
    }
            return res;}
