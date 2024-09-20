package com.dsa.BinaryTree;

import java.util.Scanner;

public class Binarytree {
    public Binarytree(){

    }
    private static class Node{
        private int val;
        Node left,right;
        public Node(int val){
            this.val=val;
        }
    }
    private Node root;
    //insert
    public void insert(Scanner sc){
        System.out.println("Enter root node: ");
        int val=sc.nextInt();
        root=new Node(val);
        insert(sc,root);
    }
    private void insert(Scanner sc,Node node){
        System.out.println("Do u want to enter left of "+node.val+" ? True or False");
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter value of left of "+node.val);
            int val=sc.nextInt();
            node.left=new Node(val);
            insert(sc,node.left);
        }
        System.out.println("Do u want to enter right of "+node.val+" ? True or False");
        boolean right =sc.nextBoolean();
        if(right){
            System.out.println("Enter value of left of "+node.val);
            int val=sc.nextInt();
            node.right=new Node(val);
            insert(sc,node.right);
        }
    }
    public void display(){
        display(root,0);
    }
    private void display(Node node,int level){
        if (node==null){
            return;
        }

        display(node.right,level+1);
        if (level!=0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t\t");
            System.out.println("|------>" + node.val);
        }
        else{
            System.out.println(node.val);
                 }
        display(node.left,level+1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Binarytree bt=new Binarytree();
        bt.insert(sc);
        bt.display();
    }
}
