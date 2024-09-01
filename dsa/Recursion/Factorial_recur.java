package com.dsa;

import java.util.Scanner;

public class Factorial {
    static int fact_recur(int n)
    {
        if(n==0 || n==1)
            return 1;
        return n*fact_recur(n-1);
    }
   
    public static void main(String[] args) {
      
        System.out.println("\n"+fact_recur(5));
    }
}
