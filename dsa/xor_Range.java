package com.dsa;

public class xor_Range {
    public static void main(String[] args) {
        //range of xor from a to b
        //=xor(b)^xor(a-1)
        int a=3,b=9;
        int ans=Xor(b)^Xor(a-1);
        System.out.println(ans);
    }
    static int Xor(int a)
    {
        if(a%4==0) return a;
        if(a%4==1) return 1;
        if(a%4==2) return a+1;

        return 0;


    }
}
