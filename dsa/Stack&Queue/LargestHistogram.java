//https://leetcode.com/problems/largest-rectangle-in-histogram/
package com.dsa.stack;

import java.util.Stack;

public class LargestHistogramStack {
    int largestArea(int [] h){
        Stack<Integer> st=new Stack<>();
        int max=0;
        st.push(0);
        for (int i=1;i<h.length;i++){
            while (!st.isEmpty() && h[i]<h[st.peek()])
            {
                max=getMax(h,st,max,i);
            }
            st.push(i);
        }
        int i=h.length;
        while (!st.isEmpty()){
            max= getMax(h,st,max,i);
        }
        return max;
    }
    private static int getMax(int[] h, Stack<Integer> st ,int max,int i){
        int area;
        int res=st.pop();
        if (st.isEmpty()){
            area=h[res]*i;
        }
        else {
            area=h[res]*(i-1-st.peek());
        }

        return Math.max(max,area);
    }
    public static void main(String[] args) {

    }
}
