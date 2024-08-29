package com.dsa;

public class Power2orNot {
    public static void main(String[] args) {
        int n=8;
        int ans=n&(n-1);
        if(ans==0)
            System.out.println(n+" is power of 2");
        else System.out.println(n+" is not power of 2");
    }
}
