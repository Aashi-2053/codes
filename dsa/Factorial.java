package com.dsa;

import java.util.Scanner;

public class Factorial {
    static void factorial(int n){
        int f=1;
        System.out.print(n+"! = ");
        if(n==0 || n==1) System.out.println("1");
        else {
            System.out.print(n);
            for (int i = n-1; i > 0 ; i--) {
                f=i*f;
                System.out.print(" * "+i);
            }
            System.out.print(" = "+f);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
       factorial(n);
    }
}
