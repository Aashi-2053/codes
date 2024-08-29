package com.dsa;

public class Magic_num_bitwise {
    public static void main(String[] args) {
        int n=6;
        int ans=0,b=5;
        while(n>0)
        {
            int last=n&1;
            n=n>>1;
            ans+=last*b;
            b=b*5;
        }
        System.out.println(ans);
    }
}
