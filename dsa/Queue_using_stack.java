package com.dsa.queue;

import java.util.Queue;
import java.util.Stack;

public class Queue_using_stack {
    public static void main(String[] args) {
    }
}
class QueueUsingStack{
    private Stack<Integer> first,second;

    public QueueUsingStack(){
        first=new Stack<>();
        second=new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }
    public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int res=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return res;
    }
    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int res=second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return res;
    }
    public boolean empty(){
        return first.isEmpty();
    }
}