package com.dsa.recur;

public class Fibo_recur {
    public static void main(String[] args) {
        System.out.println(fibo_recur(7));
    }
    static int fibo_recur(int n)
    {
        if(n<2) return n;
        return fibo_recur(n-2)+fibo_recur(n-1);
    }
}
