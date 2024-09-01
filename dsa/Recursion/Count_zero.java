package com.dsa.recur;

public class Count_zero {
    public static void main(String[] args) {
        System.out.println(count(34003040));
    }
    static int count(int n){
        return help(n,0);
    }
    private static int help(int n,int c){
        if(n==0) return c;
        int rem=n%10;
        if(rem==0)
            return help(n/10,c+1);
        return help(n/10,c);
    }
}
