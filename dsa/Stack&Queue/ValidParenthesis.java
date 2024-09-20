//https://leetcode.com/problems/valid-parentheses/
package com.dsa.stack;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s){
        Stack<Character> st=new Stack<>();

        for (char ch:s.toCharArray()){
            if(ch=='['||ch=='('||ch=='{')
                st.push(ch);
            else{
                if(ch==')')
                {
                    if (st.isEmpty()|| st.pop()!='(')
                        return false;
                }
                if(ch==']')
                {
                    if (st.isEmpty() || st.pop()!='[')
                        return false;
                }
                if(ch=='}')
                {
                    if (st.isEmpty() || st.pop()!='{')
                        return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {

    }
}

package com.dsa.stack;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s){
        Stack<Character> st=new Stack<>();

        for (char ch:s.toCharArray()){
            if(ch=='['||ch=='('||ch=='{')
                st.push(ch);
            else{
                if(ch==')')
                {
                    if (st.isEmpty()|| st.pop()!='(')
                        return false;
                }
                if(ch==']')
                {
                    if (st.isEmpty() || st.pop()!='[')
                        return false;
                }
                if(ch=='}')
                {
                    if (st.isEmpty() || st.pop()!='{')
                        return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {

    }
}
