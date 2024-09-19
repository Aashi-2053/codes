package com.dsa.stack;
import java.util.*;
public class Custom_stack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;

    public Custom_stack(){
        this(DEFAULT_SIZE);
    }
    public Custom_stack(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return  ptr==data.length-1;//last index
    }
   public boolean isEmpty(){
        return  ptr==-1;
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from empty stack");
        }
       int rem=data[ptr];
        ptr--;
        return rem;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek from empty stack");
        }

        return data[ptr];
    }

    public static void main(String[] args) throws Exception {
        Custom_stack st=new Custom_stack(5);
        st.push(4);
        st.push(2);
        st.push(9); 
        st.push(1); 
        st.push(7);
        st.push(2);
        System.out.println(st.pop());
        
        
        
        


    }
}
