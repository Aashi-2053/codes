package com.dsa;

public class Count_setbit {
    public static void main(String[] args) {
        int n=45;
        System.out.println(Integer.toBinaryString(n));

        int c=0;

        while(n>0)
        {
            c++;
           // n-=(n&(-n));
            n=n&(n-1);
        }
        System.out.println(c);
    }
}
