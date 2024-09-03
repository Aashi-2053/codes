package com.dsa.recur;

public class SkipCharString {
    public static void main(String[] args) {
        System.out.println(skip("baccdah"));
    }
    static String skip(String str){
        if(str.isEmpty()) {
            return "";
        }
        char c=str.charAt(0);
        if(c=='a'){
            return skip(str.substring(1));
        }
        else{
            return c+skip(str.substring(1));
        }
    }
}
