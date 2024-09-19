package com.dsa.queue;

public class Circular_Queue {
    protected int data[];
    private static final int DEFAULT_SIZE=10;
    private int size=0;
    protected int end=0,front=0;

    public Circular_Queue(){
        this(DEFAULT_SIZE);
    }
   public Circular_Queue(int size)
    {
        this.data=new int[size];
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public boolean isFull()
    {
        return size==data.length;
    }
    public boolean insert(int item)
    //O(1)
    {
        if(isFull())
        {
            System.out.println("Queue full");
            return false ;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove()
    //O(1)
    {
        if(isEmpty())
        {
            System.out.println("Empty queue");
            return -1;
        }
        int res=data[front++];
        front=front%data.length;
        size--;
        return res;
    }
    public  int peek()
    {
        if(isEmpty())
        {
            System.out.println("Empty queue");
            return -1;
        }

        return data[front];
    }
    public void display() {
        if(isEmpty())
        {
            System.out.println("Empty queue");
            return ;
        }
        int i=front;
        do{
            System.out.print(data[i]+"->");
            i++;
            i%=data.length;
        }while (i!=end);
        System.out.println("end");
    }

    public static void main(String[] args) {
        Circular_Queue que=new Circular_Queue(5);
        que.insert(5);
        que.insert(7);
        que.insert(2);
        que.insert(9);
        que.insert(1);
        que.display();
        que.remove();
        que.insert(12);
        que.display();
    }

}
