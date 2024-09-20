//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
package com.dsa.stack;

import java.util.Stack;

public class ValidBracketMinAdd {
    public int minAddToMakeValid(String s)
    {
        Stack<Character> st=new Stack<>();
        for (char ch:s.toCharArray()){
            if(ch==')')
            {
                if(!st.isEmpty() && st.peek()=='(')
                    st.pop();
                else
                        st.push(ch);
            }
            else
                st.push(ch);
        }
        return st.size();
    }
    public static void main(String[] args) {

    }
}
