package com.dsa;

import java.util.Scanner;

public class HCF_LCM {
    //gcd
    static int hcf(int n,int m){
        int h=0;
        for(int i = 1; i <= n || i <= m; i++) {
            if( n%i == 0 && m%i == 0 )
                h = i;
        }
        return h;
    }
    //lcm
    static int lcm(int n,int m) {
        int l = Math.max(n, m);
        while (true) {
            if (l % n == 0 && l % m == 0)
                return l;
            ++l;
            //lcm=(n*m)/hcf
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("HCF of "+n+" is "+hcf(n,m));
        System.out.println("LCM of "+n+" is "+lcm(n,m));
    }
}
