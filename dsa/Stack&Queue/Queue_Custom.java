package com.dsa.queue;

public class Queue_Custom {

    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;

    public Queue_Custom(){
        this(DEFAULT_SIZE);
    }
    public Queue_Custom(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return  end==data.length;//last index
    }
    public boolean isEmpty(){
        return  end==0;
    }
    public void insert(int item){
        //O(1)
        if(isFull()){
            System.out.println("Queue full");
            return;
        }
        data[end++]=item;
    }
    public int remove() throws Exception{
        //O(n)
        if(isEmpty()){
            throw new Exception("Cannot remove from empty queue");
        }
        int rem=data[0];
        //shift to left
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return rem;
    }
    public int front_data() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from empty queue");
        }
        return data[0];
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from empty queue");
        }
        for (int i=0;i<end;i++){
            System.out.print(data[i]+"<-");
        }
        System.out.println("end");
    }

    public static void main(String[] args) throws Exception{
        Queue_Custom que=new Queue_Custom(5);
        que.insert(5);
        que.insert(7);
        que.insert(2);
        que.insert(9);
        que.insert(1);
        que.display();
        que.remove();
        que.display();



    }
}
