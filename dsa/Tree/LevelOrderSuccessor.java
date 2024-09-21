//level order successor
    //same
    //item next to val in level wise
public class LevelOrderSuccessor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        public static void main(String[] args) {

        }
    public  TreeNode findSuccessor(TreeNode root,int key){
        if (root==null)return null;

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);
        while (!que.isEmpty()) {
            int levelSize = que.size();

                TreeNode curr = que.poll();

                if(curr.left!=null){
                    que.offer(curr.left);
                }
                if(curr.right!=null){
                    que.offer(curr.right);
            }
                if (curr.val==key){
                    break;
                }
        }
        return que.peek();
    }
 }
