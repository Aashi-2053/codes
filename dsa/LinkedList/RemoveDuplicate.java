package com.dsa.LL;

public class RemoveDuplicate{
    private Node head,tail;
    private int size;
    public RemoveDuplicate(){
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

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }



    public void duplicate()
    {
        Node node=head;
        while (node.next!=null)
        {
            if( node.data==node.next.data){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;

    }


    public static void main(String[] args) {
       RemoveDuplicate list=new RemoveDuplicate();
        list.insertFirst(4);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.display();
        list.duplicate();
        list.display();


    }
}
