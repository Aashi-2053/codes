package com.dsa.BinaryTree;

import java.util.Stack;

public class DFSusingStack {
    private static class Node{
        private final int val;
       Node left,right;
        private int height;
        public Node(int val){
            this.val=val;
        }

    }
    private Node root;
    void dfsStack(Node node)
    {
        if(node==null)return;

        Stack<Node> st=new Stack<>();
        st.push(node);

        while (!st.isEmpty()){
            Node remove=st.pop();
            System.out.println(remove.val+" ");
            if (remove.right!=null)st.push(remove.right);
            if (remove.left!=null)st.push(remove.left);
        }

    }
}
