package com.dsa.BinaryTree;

import java.util.Scanner;

public class Traversal {
    private static class Node{
        private int val;
        Node left,right;
        public Node(int val){
            this.val=val;
        }
    }
    private Node root;
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        //n->l->r
        if(node==null)
        {return;}
        System.out.println(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node node){
        //l->n->r
        if(node==null)
        {return;}
        InOrder(node.left);
        System.out.println(node.val+" ");
        InOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        //l->r->n
        if(node==null)
        {return;}
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val+" ");
    }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           Binarytree bt=new Binarytree();
            bt.insert(sc);
            bt.display();
        }
}
