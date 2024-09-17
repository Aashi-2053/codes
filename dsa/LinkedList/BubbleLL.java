package com.dsa.LL;


public class BubbleLL{
       private Node head,tail;
       private int size;
       public BubbleLL(){
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
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public void bubbleSort(){
       bubbleSort(size-1,0);
          }
       private void bubbleSort(int row,int col) {
           if(row==0)return ;
           if (col < row) {
               Node first = get(col);
               Node second = get(col + 1);
               if (first.data > second.data) {
                   //swap
                   if (first == head) {
                       head = second;
                       first.next = second.next;
                       second.next = first;
                   } else if (second == tail) {
                       Node prev = get(col - 1);
                       prev.next = second;
                       tail = first;
                       first.next = null;
                       second.next = tail;
                   } else {
                       Node prev = get(col - 1);
                       prev.next = second;
                       first.next = second.next;
                       second.next = first;
                   }
               }
               bubbleSort(row, col + 1);

           } else {
               bubbleSort(row - 1, 0);
           }
       }
       public static void main(String[] args){
           BubbleLL l1=new BubbleLL();
           l1.insertLast(5);
               l1.insertLast(4);
               l1.insertLast(3);
               l1.insertLast(2);
               l1.insertLast(1);
               l1.display();
               l1.bubbleSort();
               l1.display();

           }

}