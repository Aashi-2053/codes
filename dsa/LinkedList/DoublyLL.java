package com.dsa.LL;


public class DoublyLL {
   private Node head;
    private class Node{
        Node next,prev;
        int data;

        public Node(int data){
            this.data=data;
        }

        public Node( int data,Node next,Node prev) {
            this.next = next;
            this.data = data;
            this.prev=prev;
        }
    }
    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        node.prev=null;
        if(head!=null)head.prev=node;
        head=node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void displayRev(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        System.out.print("Reverse order: ");
        while(last!=null){
            System.out.print(last.data+"->");
            last=last.prev;
        }
        System.out.println("NULL");
    }
    public void insertLast(int data){
        //O(1)
        Node node=new Node(data);

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        Node temp=head;
        node.next=null;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }
    public Node getIdx(int idx)
    {
        Node node=head;
        for (int i=1;i<idx;i++)
        {
            node=node.next;
        }
        return node;
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
    public void insert(int data,int after){
        //O(1)
       // Node curr=getIdx(index);
        Node curr=find(after);
        if(curr==null){
            System.out.println("doesn't exist");
            return;
        }
        Node node=new Node(data);
        node.next=curr.next;
        curr.next=node;
        node.prev=curr;
        if(node.next!=null)node.next.prev=node;
    }

    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.insertFirst(3);
        dll.insertFirst(5);
        dll.insertFirst(2);
        dll.insertFirst(14);
        dll.insertLast(50);
        dll.display();
        dll.displayRev();
      //  dll.insert(23,3);
        dll.insert(23,2);
        dll.display();
    }
}
