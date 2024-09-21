package com.dsa.BinaryTree;

public class SegmentTree {
    private static class Node{
        int data,startInterval,lastInterval;
        Node left,right;
        public Node(int startInterval,int lastInterval){
            this.startInterval=startInterval;
            this.lastInterval=lastInterval;
        }

    }
    Node root;
    public SegmentTree(int[] arr){
        //create tree O(n)
        this.root=constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int s, int e) {
    if (s==e) {
        //leaf node
        Node leaf=new Node(s,e);
        leaf.data=arr[s];
        return leaf;
    }
    //create new\
        Node node=new Node(s,e);
    int mid=(s+e)/2;

    node.left=constructTree(arr,s,mid);
    node.right=constructTree(arr,mid+1,e);

    node.data=node.left.data+node.right.data;
    return node;
    }
    public  void display(){
        display(this.root);
    }
    private void display(Node node){
        String str="";
        if(node.left!=null){
            str=str+"Interval=["+node.left.startInterval+"-"+ node.left.lastInterval+"] and data: "+node.left.data+"+ ->";
        }
        else
            str=str+"No left child";

        //curr node
        str=str+"Interval=["+node.startInterval+"-"+ node.lastInterval+"] and data: "+node.data+"+ ->";
        if(node.right!=null){
            str=str+"Interval=["+node.right.startInterval+"-"+ node.right.lastInterval+"] and data: "+node.right.data;
        }
        else
            str=str+"No left child";
        System.out.println(str+'\n');
        //recursion
        if(node.left!=null)display(node.left);
        if(node.right!=null)display(node.right);
    }
    public int query(int qstart,int qend){
        return this.query(this.root,qstart,qend);
    }
    private int query(Node node,int qstart,int qend){
        if(node.startInterval>=qstart && node.lastInterval<=qend)
        {
            //node in query
            return node.data;
        }
        else if(node.startInterval>qend || node.lastInterval<qstart)
        {
            //outside
            return 0;
        }
        else {
            //overlap
            return this.query(node.left,qstart,qend)+this.query(node.right,qstart,qend);
        }
    }
    public void update(int index,int val){
        this.root.data=update(this.root,index,val);
    }
    private int update(Node node,int index,int val){
        if(index>=node.startInterval && index<= node.lastInterval)
        {
            if (index==node.startInterval && index==node.lastInterval) {
                node.data = val;
                return node.data;
            }
            else {
                int leftAns=update(node.left,index,val);
                int rightAns=update(node.right,index,val);

                node.data=leftAns+rightAns;
                return node.data;
            }
        }
        return node.data;
    }

    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};
        SegmentTree st=new SegmentTree(arr);
        //st.display();
        System.out.println(st.query(1,6)); //range sum
    }
}
