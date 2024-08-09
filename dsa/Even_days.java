package com.dsa;

import java.util.Scanner;

public class Even_days {
    static int count_even(int n){
        int c=0;
        for (int i=1;i<=n;i++){
            if(i%2==0)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int n=31;
        System.out.println("even days : "+count_even(n));
    }
}
