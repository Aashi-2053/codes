package com.dsa.BinaryTree;

import java.util.Scanner;

public class BinarySearchTree {
    private static class Node{
        private final int val;
        Node left,right;
        private int height;
        public Node(int val){
            this.val=val;
        }

    }
    private Node root;
    public BinarySearchTree(){
    }
    public  int height(Node node){
        if(node==null)return -1;
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int val){
        root=insert(val,root);
    }
    private Node insert(int val,Node node){
        if (node==null){
            node=new Node(val);
            return node;
        }
        if(val<node.val)
            node.left=insert(val,node.left);
        if(val>node.val)
            node.right=insert(val,node.right);
       node.height=Math.max(height(node.left),height(node.right)+1);
        return node;
    }
    public void display(){
        display(this.root,"Root Node ");
    }
    private void display(Node node, String detail){
        if (node==null){
            return;
        }
        System.out.println(detail+node.val);
        display(node.left,"left child of "+node.val+" : ");
        display(node.right,"right child of "+node.val+" : ");

    }
    public void populate(int[] nums){
        for (int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums,int s,int e){
       //self balance
        if(s>=e) return;
        int mid=(s+e)/2;
        this.insert(nums[mid]);
        populateSorted(nums,s,mid);
        populateSorted(nums,mid+1,e);
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node==null)return true;
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.right) && balanced(node.left);
    }


    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        int n[]={5,3,7,1,9,8,2,12,10};
        bst.populateSorted(n);
        bst.display();
        System.out.println(bst.balanced());
    }
}
