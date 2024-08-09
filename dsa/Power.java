package com.dsa;

import java.util.Scanner;

public class Power {
    static int power(int n,int m){
        int p=1;

            for (int i =1; i <= m; i++) {
               p=p*n;
            }
            return p;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number and power : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Power of "+n+"^"+m+" is "+power(n,m));
    }
}
