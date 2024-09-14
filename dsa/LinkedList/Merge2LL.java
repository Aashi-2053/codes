package com.dsa.LL;

//21 leetcode
public class Merge2LL{
    private Node head,tail;
    private int size;
    public Merge2LL(){
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



    public static Merge2LL merge(Merge2LL first ,Merge2LL second)
    {
       Node head1=first.head;
        Node head2=second.head;
        Merge2LL ans=new Merge2LL();
        while(head1!=null && head2!=null)
        {
            if(head1.data<head2.data){
                ans.insertLast(head1.data);
                head1=head1.next;
            }
            else{
                ans.insertLast(head2.data);
                head2=head2.next;
            }
        }
        while(head1!=null)
        {
                ans.insertLast(head1.data);
                head1=head1.next;
            }
        while( head2!=null)
        {
                ans.insertLast(head2.data);
                head2=head2.next;
        }
        return ans;
    }


    public static void main(String[] args) {
        Merge2LL l1=new Merge2LL();
        Merge2LL l2=new Merge2LL();
        l1.insertLast(1);
        l1.insertLast(3);
        l1.insertLast(5);
        l1.display();
        l2.insertLast(1);
        l2.insertLast(2);
        l2.insertLast(6);
        l2.insertLast(9);
        l2.display();

        Merge2LL ans = Merge2LL.merge(l1,l2);
        ans.display();


    }
}

