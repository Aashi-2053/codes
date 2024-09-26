
    //297. Serialize and Deserialize Binary Tree
    //https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
    //Serialization is the process of converting a data structure
    // or object into a sequence of bits so that it can be stored
    // in a file or memory buffer, or transmitted across a
    // network connection link to be reconstructed later in
    // the same or another computer environment.
    // Input: root = [1,2,3,null,null,4,5]
    //Output: [1,2,3,null,null,4,5]
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            helper1(root,sb);
            return sb.toString();
        }
        void helper1(TreeNode root,StringBuilder sb){
            if(root ==null){
                sb.append("null,");
                return;
            }
            sb.append(root.val).append(",");
            helper1(root.left,sb);
            helper1(root.right,sb);
            }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String str) {
            String[] node = str.split(",");
            LinkedList<String> list = new LinkedList<>();

            for (String s : node) {
                list.add(s);
            }
            return helper2(list);
        }
            TreeNode helper2(LinkedList<String > list){

                if (list.isEmpty()) return null;
            String ans=list.removeFirst();

            if (ans.equals("null")) return null;

            TreeNode root=new TreeNode(Integer.parseInt(ans));
            root.left=    helper2(list);
                root .right=helper2(list);
                return root;
            }

        }
