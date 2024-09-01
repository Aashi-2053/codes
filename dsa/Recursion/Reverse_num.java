package com.dsa.recur;

public class Reverse_num {
    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);
        System.out.println(rev2(1234));
    }
    static int sum=0;
    static void rev1(int n){
        if(n==0) return;
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }
    static int rev2(int n){
       int digits=(int)(Math.log10(n))+1;
       return help(n,digits);
    }
    private static int help(int n,int d){
        if(n%10==0)return n;
        int rem=n%10;
        return rem*(int)(Math.pow(10,d-1))+help(n/10,d-1);
    }
}
