package com.dsa.BinaryTree;

public class AVL {
        private static class Node{
            private final int val;
            Node left,right;
            private int height;
            public Node(int val){
                this.val=val;
            }

        }
        private Node root;
        public AVL(){
        }
        public  int height(Node node){
            if(node==null)return -1;
            return node.height;
        }

        public void insert(int val){

            root=insert(val,root);
        }
        private Node insert(int val, Node node){
            if (node==null){
                node=new Node(val);
                return node;
            }
            if(val<node.val)
                node.left=insert(val,node.left);
            if(val>node.val)
                node.right=insert(val,node.right);
            node.height=Math.max(height(node.left),height(node.right)+1);
            return rotate(node);
        }

        private Node rotate(Node node) {
           if( height(node.left)-height(node.right)>1){
               //left heavy
               if( height(node.left.left)-height(node.left.right)>0)//posi
               {
                   //left-left case
                   return rightRotate(node);
               }
               if( height(node.left.left)-height(node.left.right)<0)//nega
               {
                   //left right case
                   node.left=leftRotate(node.left);
                   return rightRotate(node);
               }
           }
            if( height(node.left)-height(node.right)< -1){
                //right heavy
                if( height(node.right.left)-height(node.right.right)<0)//posi
                {
                    //right-right case
                    return leftRotate(node);
                }
                if( height(node.right.left)-height(node.right.right)>0)//nega
                {
                    //right left case
                    node.right=rightRotate(node.right);
                    return leftRotate(node);
                }
            }
            return node;
        }
    public Node rightRotate(Node parent){
            Node child=parent.left;
            Node gc=child.right;
            child.right=parent;
            child.left=gc;
            parent.height=Math.max(height(parent.left),height(parent.right)+1);
            child.height=Math.max(height(child.left),height(child.right)+1);
        return child;
    }

        public Node leftRotate(Node parent){
            Node child=parent.right;
            Node gc=child.left;
            child.left=parent;
            child.right=gc;
            parent.height=Math.max(height(parent.left),height(parent.right)+1);
            child.height=Math.max(height(child.left),height(child.right)+1);
            return child;
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
    public boolean isEmpty() {
        return root == null;
    }

    public boolean balanced(){
            return balanced(root);
        }
        private boolean balanced(Node node){
            if (node==null)return true;
            return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.right) && balanced(node.left);
        }


        public static void main(String[] args) {
           AVL tree=new AVL();
           // int n[]={1,2,3,4,5,6,7,8,9};
            //tree.insert(n);
            tree.display();
        }
    }

