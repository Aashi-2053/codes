package com.dsa.recur;

public class SumDigit_recur {
    public static void main(String[] args) {
        System.out.println("sum : "+sum_recur(1342));
    }
    static int sum_recur(int n)
    {
        if(n==0)return 0;
        return sum_recur(n/10)+(n%10);
    }
}
