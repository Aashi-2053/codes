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
    static int gcd(int a,int b){

        if(a==0)return b;

        return gcd(b%a,a);//euclid algo
    }
    //lcm
    static int lcm(int a,int b) {
        /*int l = Math.max(n, m);
        while (true) {
            if (l % n == 0 && l % m == 0)
                return l;
            ++l;
            */

           return a*b/gcd(a,b);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        //System.out.println("HCF of "+n+" is "+hcf(n,m));
        System.out.println("LCM of "+n+" is "+lcm(n,m));
        System.out.println("gcd "+gcd(3,9));
    }
}

