
 //https://leetcode.com/problems/average-of-levels-in-binary-tree/
    //637. Average of Levels in Binary Tree

        public List<Double> averageOfLevels(TreeNode root){
    List<Double> res = new ArrayList<>();
            if (root == null) return res;

    Queue<TreeNode> que = new LinkedList<>();

            que.offer(root);
            while (!que.isEmpty()) {
        int levelSize = que.size();

        double avg=0;

        for (int i = 0; i < levelSize; i++) {
            TreeNode curr = que.poll();
            avg= avg+curr.val;
            if(curr.left!=null){
                que.offer(curr.left);
            }
            if(curr.right!=null){
                que.offer(curr.right);
            }
        }
        avg=avg/levelSize;
        res.add(avg);
    }
            return res;

