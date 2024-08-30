package com.dsa;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        fibo_Series(n);
        //using formula
        System.out.println();
        for(int i=1;i<n;i++)
        System.out.print(fiboFormula(i)+" ");
    }
    static void fibo_Series(int n){
        int a=0,b=1;
        int sum=a+b;
        System.out.print(a+", "+b+", ");
        for(int i=3;i<=n;i++){
            System.out.print(sum+", ");
            a=b;
            b=sum;
            sum=a+b;
        }
    }
    static int fiboFormula(int n){
        return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
