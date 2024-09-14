package com.dsa.LL;

public class LL1 {
    private Node head,tail;
    private int size;
    public LL1(){
        this.size=0;
    }
    private class Node{
        int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data,Node next) {
            this.data = data;
            this.next=next;
        }
    }

    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int data){
        //O(1)
        if(tail==null){
           insertFirst(data);
           return;
        }
        Node node=new Node(data);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public void insert(int data,int index){
        //O(1)
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertLast(data);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++) {
            temp=temp.next;
        }
        Node node=new Node(data,temp.next);
        temp.next=node;
        size++;

    }
    public int deleteFirst()
    {
        int val=head.data;
        head=head.next;
        if(head==null)tail=null;
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1)return deleteFirst();
        Node curr=getIdx(size-2);
        int val=tail.data;
        tail=curr;
        tail.next=null;
        return val;
    }
    public Node getIdx(int idx)
    {
        Node node=head;
        for (int i=0;i<idx;i++)
        {
            node=node.next;
        }
        return node;
    }
    public int delete(int idx){
        if(idx==0)return deleteFirst();
        if(idx==size-1)return deleteLast();
        Node prev=getIdx(idx-1);
        int val=prev.next.data;
        prev.next=prev.next.next;
        return val;
    }
    public Node find(int val)
    {
        Node node=head;
        while (node!=null)
        {
            if(node.data==val)return node;
            node=node.next;
        }
        return null;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    private Node insertRec(int data, int idx, Node node){
        if(idx==0)
        {
           Node temp=new Node(data,node);
            size++;
            return temp;
        }
        node.next=insertRec(data,idx-1,node.next);
        return node;
    }
    public void insertRec(int data,int index){
        head=insertRec(data,index,head);
    }



    public static void main(String[] args) {
        LL1 list=new LL1();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(14);
        list.insertLast(6);
        list.insert(20,3);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        list.delete(2);
        list.display();
        list.insertRec(32,3);
        list.insertRec(12,1);
        list.display();

    }
}
