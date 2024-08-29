package com.dsa;

public class Find_ith_bit {
    public static void main(String[] args) {
        int n=182;//10110110
        //5th=1
        int ans=n& (1<<(5-1));
        //ans=10000=16
        System.out.println(ans);
    }
}
