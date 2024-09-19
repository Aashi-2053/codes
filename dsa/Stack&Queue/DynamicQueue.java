package com.dsa.queue;

public class DynamicQueue extends Circular_Queue{
    public DynamicQueue(){
        super();//call CustomStack()
    }
    public DynamicQueue(int n){
        super();// call CustomStack(int n)
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()){
            //double size
            int[] temp=new int[data.length*2];
            //copy all in new
            for (int i=0;i< data.length;i++){
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data=temp;
        }
        return super.insert(item);
    }

    public static void main(String[] args) {
        DynamicQueue que=new DynamicQueue(5);
        que.insert(5);
        que.insert(7);
        que.insert(2);
        que.insert(9);
        que.insert(1);
        que.insert(15);
        que.insert(87);
        que.display();
        que.remove();
        que.insert(12);
        que.display();
    }

}
