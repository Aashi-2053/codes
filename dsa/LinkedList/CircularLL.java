package com.dsa.LL;

public class CircularLL {
    private Node head,tail;
    public CircularLL(){
        this.head=null;
        this.tail=null;
    }
    private class Node {
        int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void insert(int data){
        Node node=new Node(data);
        if(head==null) {
            tail = node;
            head=node;
            return;
        }
        tail.next=node;
        node.next=head;
       tail=node;
    }
    public void display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.data+"->");
                temp=temp.next;
            }while (temp!=head);
        }

        System.out.println("Head");
    }
    public void delete(int val){
        Node node=head;
        if(node==null)return ;
        if (node.data==val)
        {
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.data==val)
            {
                node.next=n.next;
                break;
            }
            node=node.next;
        }while (node!=head);
    }

    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.insert(3);
        list.insert(5);
        list.insert(2);
        list.insert(14);
        list.display();
        list.delete(2);
        list.display();
    }

}
