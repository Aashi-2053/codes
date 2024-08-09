package com.dsa;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        fibo_Series(n);
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
}
