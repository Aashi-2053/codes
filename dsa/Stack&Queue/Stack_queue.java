package com.dsa.stack;
import java.util.*;
public class Stack_Queue {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st.pop());

        Queue<Integer> q=new LinkedList<>();
        q.add(4);
        q.add(6);
        q.add(12);
        q.add(5);
        System.out.println(q.peek());//get head
        System.out.println(q.remove());
        System.out.println(q.remove());

        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(6);
        dq.addLast(9);
        dq.removeFirst();
    }
}
