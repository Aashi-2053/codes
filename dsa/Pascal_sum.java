package com.dsa;

public class Pascal_sum {
    public static void main(String[] args) {
        /*
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        1 5 10 10 5 1
        sum of nth row
         */
       int  n=5;
        int ans=1<<(n-1);
        System.out.println(ans);
    }
}
